const account_list = [
    {
        num:"1234567890123456",
        pin:"1234",
    },
];
const check_accountForm = document.querySelector(".check_account");
const check_pinForm = document.querySelector(".check_pin");
let account_num = "";
let pin = "";
let pin_len = 0;
let attempts = 5;

function input_num(event) {       // function to input the account_num
    if (event.value != "del") {
        account_num += event.value;
    }
    else {
        account_num = account_num.slice(0,-1); // ---referred on Stackoverflow---
    }
    document.getElementById("account_num").value = account_num;
}

function check_account(event) {    // if enter inputs, check the account exist in the account list
    for (var i = 0; i < account_list.length; i++) {
        const account = account_list[i];
        if (account_num == account.num) {
            check_accountForm.style.display = "none";
            check_pinForm.style.display = "block";
        }
        else {
            alert("That account number does not exist!");
            document.getElementById("account_num").value = "";
            account_num = "";
        }
    }
}

function input_pin(event) {     // function to input the pin
    if (pin_len < 4) {
        if (event.value != "del") {
            pin += event.value;
            document.getElementById("pin").value = pin;
            pin_len++;
        }
        else {
            pin = pin.slice(0, -1);   // ---referred on Stackoverflow---
            document.getElementById("pin").value = pin;
            pin_len--;
        }
    }
    else if (pin_len >= 4) {
        if (event.value == "del") {
            pin = pin.slice(0, -1);   // ---referred on Stackoverflow---
            document.getElementById("pin").value = pin;
            pin_len--;
        }
    }
}

function check_pin(event) {      // if the enter inputs, check the pin matches the account in the account list
    pin_len = 0;
    if (attempts >= 0) {
        for (let i = 0; i < account_list.length; i++) {
            const account = account_list[i];
            if (pin == account.pin) {
                location.href="main.html";    // ---referred on Stackoverflow---
            }
            else {
                attempts--;
                alert("Incorrect PIN, You have " + attempts + " attempts left");
                document.getElementById("pin").value = "";
                pin = "";
            }
        }
    }
    else {
        alert("You have used all of your attempts. Please contact the staff");
    }
}

function return_card(event) {        // function to initializing the value and return to the first page
    location.href="index.html";      // ---referred on Stackoverflow---
    document.getElementById("account_num").value = "";
    account_num = "";
    document.getElementById("pin").value = "";
    pin = "";
    pin_len = 0;
    attempts = 0;
}