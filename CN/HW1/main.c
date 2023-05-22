#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <WinSock2.h>

#define MAX_PACKET 15
#define DF(fragment) (fragment & 0x40)
#define MF(fragment) (fragment & 0x20)

typedef struct _f_header
{
    char file_header[24];
} f_header;

typedef struct _timeval
{
    long sec;
    long usec;
} timeval;

typedef struct _p_header
{
    timeval time;
    unsigned int caplen;
    unsigned int len;
} p_header;

typedef struct _mac_header
{
    unsigned char dst_mac[6];
    unsigned char src_mac[6];
    unsigned short type;
} mac_header;

typedef struct _ip_header
{
    unsigned char ver_hlen;
    unsigned char ds;
    unsigned short tlen;
    unsigned short id;
    unsigned short fragment;
    unsigned char ttl;
    unsigned char protocol;
    unsigned short checksum;
    unsigned long src_addr;
    unsigned long dst_addr;
} ip_header;

p_header p_headers[MAX_PACKET];

char p_data[65536];
int count;

void ignore_f_header(const char *path);
void read_packet(FILE *fp);
void printPHeader(p_header *ph);
void printMAC(char *data);
void printIP(char *data);

int main(int argc, char *argv[])
{
    if (argc != 2)
    {
        printf("failed to open\n");
        exit(1);
    }
    ignore_f_header(argv[1]);

    return 0;
}

void ignore_f_header(const char *path)
{
    FILE *fp = fopen(path, "rb");
    f_header f_hd;
    fread(&f_hd, sizeof(f_hd), 1, fp);
    read_packet(fp);
    fclose(fp);
}
void read_packet(FILE *fp)
{
    p_header *ph = p_headers;

    while (!feof(fp))
    {
        if (fread(ph, sizeof(p_header), 1, fp) != 1)
        {
            break;
        }
        if (count < MAX_PACKET)
        {
            printPHeader(ph);
            fread(p_data, ph->caplen, 1, fp);
            printMAC(p_data);
            printIP(p_data + sizeof(mac_header));
            printf("-----------------------------------------------------------------------------------------------------------------\n");
            ph++;
        }
        else
        {
            break;
        }
    }
}
void printPHeader(p_header *ph)
{
    timeval timer;
    struct tm *t;
    timer = ph->time;
    t = localtime(&timer.sec);

    count++;
    printf("Frame %d:\n", count);
    printf("local time: %02d:%02d:%02d (KST), ", t->tm_hour, t->tm_min, t->tm_sec);
    printf("captured length: %u bytes, actual length: %u bytes.\n", ph->caplen, ph->len);
}
void printMAC(char *data)
{
    mac_header *mac = (mac_header *)data;

    int i = 0;
    int j = 0;

    printf("Ethernet II,\nSrc:");

    for (i; i < 5; i++)
    {
        printf("%02x:", mac->src_mac[i]);
    }
    printf("%02x", mac->src_mac[i]);
    printf(", Dst: ");
    for (j; j < 5; j++)
    {
        printf("%02x:", mac->dst_mac[j]);
    }
    printf("%02x\n", mac->dst_mac[j]);
}
void printIP(char *data)
{
    ip_header *ip = (ip_header *)data;

    printf("IPv4,\nSrc: ");
    printf("%d.%d.%d.%d", (ntohl(ip->src_addr) >> 24) & 0xFF, (ntohl(ip->src_addr) >> 16) & 0xFF, (ntohl(ip->src_addr) >> 8) & 0xFF, ntohl(ip->src_addr) & 0xFF);
    printf(", Dst: ");
    printf("%d.%d.%d.%d / ", (ntohl(ip->dst_addr) >> 24) & 0xFF, (ntohl(ip->dst_addr) >> 16) & 0xFF, (ntohl(ip->dst_addr) >> 8) & 0xFF, ntohl(ip->dst_addr) & 0xFF);

    switch (ip->protocol)
    {
    case 1:
        printf("Protocol: ICMP / ");
        break;
    case 2:
        printf("Protocol: IGMP / ");
        break;
    case 6:
        printf("Protocol: TCP / ");
        break;
    case 17:
        printf("Protocol: UDP / ");
        break;
    default:
        printf("No Protocol");
        break;
    }

    printf("ID: %u\n", ntohs(ip->id));

    printf("Flags: ");
    if (DF(ip->fragment))
    {
        printf("Don't fragment - Set / ");
    }
    else
    {
        printf("Don't fragment - Not set, ");
        if (MF(ip->fragment))
        {
            printf("More fragment - Set / ");
        }
        else
        {
            printf("More fragment - Not set / ");
        }
    }

    printf("TTL: %d / ", ip->ttl);
    printf("TOS: 0X%02x\n", ip->ds);
}