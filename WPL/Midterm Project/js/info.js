var running_balance;           // the variable to use localstorage, load the value
let Tdata = JSON.parse(localStorage.getItem("table_data" || "[]"));   // the data to make the info_table, load the value
                                                                      // ---referred on Stackoverflow---
const table = document.getElementById("info_table");
const currentForm = document.getElementById("current_bal");

function init_(event) {      // function to initialize the info_table at first
    localStorage.setItem("running_balance", "2000");
    running_balance = localStorage.getItem("running_balance");        // ---referred on Stackoverflow---
    currentForm.innerText = `Current Balance: $${running_balance}`;

    const tr = document.createElement("tr");                          // ---referred on Google---
    const td1 = document.createElement("td");
    const td2 = document.createElement("td");
    const td3 = document.createElement("td");
    const td4 = document.createElement("td");

    const date = new Date();

    td1.innerText = date.toString();
    td2.innerText = "0";
    td3.innerText = "0";
    td4.innerText = running_balance;

    tr.appendChild(td1);
    tr.appendChild(td2);
    tr.appendChild(td3);
    tr.appendChild(td4);

    table.appendChild(tr);
}

function getTable(event){                // function to make the info_table
    for (let i = 0; i < Tdata.length; i++) {
        const tr = document.createElement("tr");
        const td1 = document.createElement("td");
        const td2 = document.createElement("td");
        const td3 = document.createElement("td");
        const td4 = document.createElement("td");
    
        td1.innerText = Tdata[i].date;
        td2.innerText = Tdata[i].O_funds;
        td3.innerText = Tdata[i].I_funds;
        running_balance = parseFloat(running_balance)-parseFloat(Tdata[i].O_funds)+parseFloat(Tdata[i].I_funds)
        td4.innerText = running_balance;
        localStorage.setItem("running_balance", JSON.stringify(running_balance));  // change the value in the localstorage
        
        tr.appendChild(td1);
        tr.appendChild(td2);
        tr.appendChild(td3);
        tr.appendChild(td4);
    
        table.appendChild(tr);
    }

    currentForm.innerText = `Current Balance: $${running_balance}`;
}

// <---referred on NomadCoder's lecture---
init_();    // call the initializing function

const savedT = localStorage.getItem("table_data" || "[]");  // get the data to make the info_table
                                                            
if (savedT !== null) {
    const parsedTdata = JSON.parse(savedT);        // parsing the data
    Tdata = parsedTdata;
    getTable();                 // iteration for the length of data
}
// ---referred on NomadCoder's lecture--->
