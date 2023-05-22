let firstFlag = 0; // no data = 0, data O, but invalid = 1, data O, valid = 2
let lastFlag = 0;
let genderFlag = 0;
let emailFlag = 0;
let passwordFlag = 0;
let c_passwordFlag = 0;

let userData = [];  // list for user data

//<---------------------to prevent the user data initialize -------------_-----------
const savedUser = localStorage.getItem("user" || "[]");

if (savedUser != null) {
    userData = JSON.parse(localStorage.getItem("user" || "[]"));
}
//---------------------------------------------------------------------------------->
$(document).ready(()=> {  // initialize the form
    $('.signup_form').hide();
    $('.signed').hide();
    $('.loggedin').hide();
    
    $('.alert').hide();
    $('.check').hide();
});

$('.signup_tab').click(() => {  // tab bar
    $('.login_form').hide();
    $('.signup_form').slideDown(100);
    $('.login_tab').css('background-color', 'whitesmoke');
    $('.signup_tab').css('background-color', 'white');
});

$('.login_tab').click(() => {  // tab bar
    $('.signup_form').hide();
    $('.signed').hide();
    $('.alert').hide();
    $('.login_form').slideDown(100);
    $('.signup_tab').css('background-color', 'whitesmoke');
    $('.login_tab').css('background-color', 'white');
    $('#first_name').css('border-color', 'white');
    $('#last_name').css('border-color', 'white');
    $('#new_email').css('border-color', 'white');
    $('#new_password').css('border-color', 'white');
    $('#new_c_password').css('border-color', 'white');
    $('#first_name').val() = "";
    $('#last_name').val() = "";
    $('#new_email').val() = "";
    $('#new_password').val() = "";
    $('#new_c_password').val() = "";
});

$('#login_button').click((event) => {  // submit the user email and password, and check them
    event.preventDefault(1000);
    let i = 0;
    for (i; i < userData.length; i++) {
        if ($('#email').val() == userData[i].email) {
            break
        }
    }
    if ($('#email').val() == userData[i].email && $('#password').val() == userData[i].password) {
        $('.login_form').hide();
        $('.signup_form').hide();
        $('.login_tab').hide();
        $('.signup_tab').hide();
        $('.loggedin').show();
        $('.check').hide();
    } 
    else {
        $('.login_info').text("Credential do not match!");  // 로그인 정보가 안맞으면
        $('.login_info').css('color', 'red');
    }

});

$('#signup_button').click((event) => {  // submit sign-up information
    event.preventDefault();
    if ($('#first_name').val() == "") {
        firstFlag = 0;
        $('#sign_first').show();
        $('#first_name').css('border-color', 'red');
    }
    if ($('#last_name').val() == "") {
        lastFlag = 0;
        $('#sign_last').show();
        $('#last_name').css('border-color', 'red');
    }
    if ($(':radio[name="gender"]:checked').val() == undefined) {
        genderFlag = 0;
        $('#sign_gender').show();
    }
    if ($('#new_email').val() == "") {
        emailFlag = 0;
        $('#sign_email').show();
        $('#new_email').css('border-color', 'red');
    }
    if ($('#new_password').val() == "") {
        passwordFlag = 0;
        $('#sign_pass').show();
        $('#new_password').css('border-color', 'red');
    }
    if ($('#new_c_password').val() == "") {
        c_passwordFlag = 0;
        $('#sign_c_pass').show();
        $('#new_c_password').css('border-color', 'red');
    }

    if (firstFlag == 2 && lastFlag == 2 && genderFlag == 2 && emailFlag == 2 && passwordFlag == 2 && c_passwordFlag == 2) { // if the flags are all 2, sign up
        const newdata = {
            first: $('#first_name').val(),
            last: $('#last_name').val(),
            gender: $(':radio[name="gender"]:checked').val(),
            email: $('#new_email').val(),
            password: $('#new_password').val(),
            n_password: $('#new_c_password').val(),
        };
        userData.push(newdata);
        localStorage.setItem("user", JSON.stringify(userData));

        $('.check').hide();
        $('.signup_form').hide();
        $('.signed').show();
    }
});

 //<---------------- focus the input box----------------
$('#first_name').focus(() => {
    if ($('#first_name').val() == "") {
        firstFlag = 0;
        $('#sign_first').show();
        $('#first_name').css('border-color', 'red');
    }
});
$('#last_name').focus(() => {
    if ($('#last_name').val() == "") {
        lastFlag = 0;
        $('#sign_last').show();
        $('#last_name').css('border-color', 'red');
    }
});
$('#new_email').focus(() => {
    if ($('#new_email').val() == "") {
        emailFlag = 0;
        $('#sign_email').show();
        $('#new_email').css('border-color', 'red');
    }
});
$('#new_password').focus(() => {
    if ($('#new_password').val() == "") {
        passwordFlag = 0;
        $('#sign_pass').show();
        $('#new_password').css('border-color', 'red');
    }
});
$('#new_c_password').focus(() => {
    if ($('#new_c_password').val() == "") {
        c_passwordFlag = 0;
        $('#sign_n_pass').show();
        $('#new_c_password').css('border-color', 'red');
    }
});
//-------------------------------------------------------->

//<-------------------------regular expressions to check name, email, and password--------------------------
let nameCheck = /^[A-Z]+[a-zA-Z]+$/;
let emailCheck =  /^[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/i;
let passCheck = /^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[~?!@#$%^&*_-]).{6,}$/;
//------------------------------------------reference on google-------------------------------------------->

//<-------------------check the input value----------------------
$('#first_name').change(() => {
    $('#sign_first').hide();
    if (!nameCheck.test($('#first_name').val())) {
        firstFlag = 1;
        $('#sign_first1').show();
        $('#first_name').css('border-color', 'red');
        $('#check_1').hide();
    }
    else {
        firstFlag = 2;
        $('#sign_first1').hide();
        $('#first_name').css('border-color', 'white');
        $('#check_1').show();
    }
});
$('#last_name').change(() => {
    $('#sign_last').hide();
    if (!nameCheck.test($('#last_name').val())) {
        lastFlag = 1;
        $('#sign_last1').show();
        $('#last_name').css('border-color', 'red');
        $('#check_2').hide();
    }
    else {
        lastFlag = 2;
        $('#sign_last1').hide();
        $('#last_name').css('border-color', 'white');
        $('#check_2').show();
    }
});
$('#gender input').click(() => {
    genderFlag = 2;
    $('#sign_gender').hide();
    $('#check_3').show();
});
$('#new_email').change(() => {
    $('#sign_email').hide();
    if (!emailCheck.test($('#new_email').val())) {
        emailFlag = 1;
        $('#sign_email1').show();
        $('#new_email').css('border-color', 'red');
        $('#check_4').hide();
    }
    else {
        emailFlag = 2;
        $('#sign_email1').hide();
        $('#new_email').css('border-color', 'white');
        $('#check_4').show();
    }
});
$('#new_password').change(() => {
    $('#sign_pass').hide();
    if (!passCheck.test($('#new_password').val())) {
        passwordFlag = 1;
        $('#sign_pass1').show();
        $('#new_password').css('border-color', 'red');
        $('#check_6').hide();
    }
    else {
        passwordFlag = 2;
        $('#sign_pass1').hide();
        $('#new_password').css('border-color', 'white');
        $('#check_5').show();
    }
});
$('#new_c_password').change(() => {
    $('#sign_c_pass').hide();
    if ($('#new_password').val() != $('#new_c_password').val()) {
        c_passwordFlag = 1;
        $('#sign_c_pass1').show();
        $('#new_c_password').css('border-color', 'red');
        $('#check_6').hide();
    }
    else {
        c_passwordFlag = 2;
        $('#sign_c_pass1').hide();
        $('#new_c_password').css('border-color', 'white');
        $('#check_6').show();
    }
});
//--------------------------------------------------------------------->

//<-------------------------focus input box-----------------------------
$('#email').focus(() => {
    if ($('#email').val() == "") {
        $('#log_email').show();
        $('#email').css('border-color', 'red');
    }
});
$('#password').focus(() => {
    if ($('#password').val() == "") {
        $('#log_pass').show();
        $('#password').css('border-color', 'red');
    }
});
//--------------------------------------------------------------------->
//<----------------------check the input value--------------------
$('#email').change(() => {
    if (!emailCheck.test($('#email').val())) {
        $('#log_email').show();
        $('#email').css('border-color', 'red');
        $('#check_1').hide();
    }
    else {
        $('#log_email').hide();
        $('#email').css('border-color', 'white');
        $('#check_1').show();
    }
});
$('#password').change(() => {
    if ($('#password').val() == "") {
        $('#log_pass').show();
        $('#password').css('border-color', 'red');
        $('#check_2').hide();
    }
    else {
        $('#log_pass').hide();
        $('#password').css('border-color', 'white');
        $('#check_2').show();
    }
});
//---------------------------------------------------------------->
