//------------------For submit img using axios------------------
if (document.getElementById("img")) {
    document.getElementById("img").addEventListener("change", function (e) {
        const formData = new FormData();
        formData.append("img", this.files[0]);
        axios
            .post("/post/community/img", formData)
            .then((res) => {
                document.getElementById("img-url").value = res.data.url;
                document.getElementById("img-preview").src = res.data.url;
                document.getElementById("img-preview").style.display = "inline";
            })
            .catch((err) => {
                console.error(err);
            });
    });
}