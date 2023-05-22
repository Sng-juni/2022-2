let deposit = "";   // variable for deposit amount
let withdraw = 0;   // variable for withdraw amount
let transfer = "";  // variable for transfer amount
let table_data = []; // variable for the table_data

// for info_table
const infoTableForm = document.querySelector(".info_table");

// for deposit
const input_depForm = document.querySelector(".input_deposit");
const check_depForm = document.querySelector(".check_deposit");
const ok_depForm = document.querySelector(".ok_deposit");
const depositedForm = document.querySelector(".deposited");
const deposit_amount = document.querySelector("#dep_amount");

// for withdraw
const input_withForm = document.querySelector(".input_withdraw");
const check_withForm = document.querySelector(".check_withdraw");
const withdrawedForm = document.querySelector(".withdrawed");
const withdraw_amount = document.querySelector("#with_amount");

// for trasfer
const input_transForm = document.querySelector(".input_transfer");
const check_transForm = document.querySelector(".check_transfer");
const transferredForm = document.querySelector(".transferred");
const trans_amount = document.querySelector("#trans_amount");
const trans_from = document.querySelector("#trans_from");
const trans_to = document.querySelector("#trans_to");

var running_balance = localStorage.getItem("running_balance");   // varible to use running balance in the local storage

// <---referred on NomadCoder's lecture---
const saved_table_data = localStorage.getItem("table_data" || "[]");

if (saved_table_data != null) {                     // load the table data
    table_data = JSON.parse(localStorage.getItem("table_data" || "[]"));
}
// ---referred on NomadCoder's lecture--->

//---------------------------------------------------Deposit------------------------------------------------------
function input_dep(event) {   // function to input the amount of deposit
    if (event.value != "del") {
        deposit += event.value;
    }
    else {
        deposit = deposit.slice(0,-1);    // ---referred on Stackoverflow---
    }
    document.getElementById("deposit").value = deposit;
}
function check_dep(event) {   // function to get the deposit and invisible the input form
    deposit = document.getElementById("deposit").value;
    input_depForm.style.display = "none";
    check_dep_amount(deposit);
}
function check_dep_amount(deposit) {  // function to make visible check_deposit form
    check_depForm.style.display = "block";
    deposit_amount.innerHTML = `$${deposit}?`;
}
function deposit_(event) {   // function to make the table data and push to the array
    const date = new Date();       // ---referred on Google---
    const newdata = {
        date: date.toString(),
        O_funds: "0",
        I_funds: deposit,
    };
    deposit= "";
    // <---referred on NomadCoder's lecture---
    table_data.push(newdata);
    localStorage.setItem("table_data", JSON.stringify(table_data));   // set the data in the local storage
    // ---referred on NomadCoder's lecture--->

    check_depForm.style.display = "none";  // make the check form invisible, and the ok form visible
    ok_depForm.style.display = "block";
}
function back_deposit(event) {  // if the No button inputs, make the input form visible and check form invisible
    check_depForm.style.display = "none";
    input_depForm.style.display = "block";
}
function dep_ok(event) {      // if the OK button inputs, make the ok form invisible and deposited form visible
    deposit = "";
    ok_depForm.style.display = "none";
    depositedForm.style.display = "block";
}

//---------------------------------------------------Withdraw------------------------------------------------------
function input_with(event) {  // function to input the amount of withdraw
    if (event.value == "100") {  // if the button images input, this function works
        withdraw += 100;
        document.getElementById("withdraw").value = withdraw;
    }
    else if (event.value == "20") {
        withdraw += 20;
        document.getElementById("withdraw").value = withdraw;
    }
    else if (event.value == "-20") {
        if (document.getElementById("withdraw").value - 20 >= 0) {
            withdraw -= 20;
            document.getElementById("withdraw").value = withdraw;
        }
    }
    else if (event.value == "-100") {
        if (document.getElementById("withdraw").value - 100 >= 0) {
            withdraw -= 100;
            document.getElementById("withdraw").value = withdraw;
        }
    }
    else if (event.value == "enter") {  // make the input form invisible, and check form visible
        withdraw_amount.innerText = `$${withdraw}?`;
        input_withForm.style.display = "none";
        check_withForm.style.display = "block";
        
    }
}
function check_with(event) {  // if the link buttons input, this function works
    withdraw = event.value;
    withdraw_amount.innerText = `$${withdraw}?`;
    input_withForm.style.display = "none";  // make the input form invisible, and check form visible
    check_withForm.style.display = "block";
}
function back_main(event) {   // function to the previous page
    location.href="main.html";
}
function withdraw_(event) {   // if the amount of withdraw is more than running balance, and is not 0, make the table data
    if (parseFloat(running_balance) >= withdraw && withdraw != 0) {
        const date = new Date();    // ---referred on Google--
        const newdata = {
            date: date.toString(),
            O_funds: withdraw,
            I_funds: "0",
        };
        withdraw= "";
        // <---referred on NomadCoder's lecture---
        table_data.push(newdata);
        localStorage.setItem("table_data", JSON.stringify(table_data));  // set the data in the local storage
        // ---referred on NomadCoder's lecture--->

        check_withForm.style.display = "none";
        withdrawedForm.style.display = "block";
    }
    else {
        alert("Your running balance is not enough.");
        document.getElementById("withdraw").value = 0;
        back_withdraw(event);
    }
    
}
function back_withdraw(event) {      // function to the previous things
    check_withForm.style.display = "none";
    input_withForm.style.display = "flex";
}

//---------------------------------------------------Transder------------------------------------------------------
function input_trans(event) {   // function to input the amount of transfer
    if (event.value != "del") {
        transfer += event.value;
    }
    else {
        transfer = transfer.slice(0,-1);
    }
    document.getElementById("transfer").value = transfer;
}
function check_trans(event) {   // make the input form invisible, and check form visible
    trans_amount.innerText = `$${transfer}`;
    trans_from.innerText = `From 1234567890123456`
    trans_to.innerText = `To 1234567887654321`
    input_transForm.style.display = "none";
    check_transForm.style.display = "block";
}
function transfer_(event) {   // if the amount of withdraw is more than running balance, and is not 0, make the table data
    if (running_balance >= transfer && transfer != "0") {
        const date = new Date();    // ---referred on Google---
        const newdata = {
            date: date.toString(),
            O_funds: transfer,
            I_funds: "0",
        };
        transfer= "";
        // <---referred on NomadCoder's lecture---
        table_data.push(newdata);
        localStorage.setItem("table_data", JSON.stringify(table_data));
        // ---referred on NomadCoder's lecture--->
    
        check_transForm.style.display = "none";
        transferredForm.style.display = "block";
    }
    else {
        alert("Your running balance is not enough.");
        back_transfer(event);
    }
}
function back_transfer(event) {    // function to the previous things
    check_transForm.style.display = "none";
    input_transForm.style.display = "flex";
}