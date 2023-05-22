let score = "0";    // to calculate the Score

const startButton = document.getElementById('start');  // start button
const mainForm = document.querySelector('.main');      // Main Form

const Q1Form = document.querySelector('.q1');          // Question 1 Form
const q1 = document.getElementById('question_1');
const q1a1 = document.getElementById('q1_a1');
const q1a2 = document.getElementById('q1_a2');
const q1a3 = document.getElementById('q1_a3');
const q1a4 = document.getElementById('q1_a4');

const Q2Form = document.querySelector('.q2');          // Question 2 Form 
const q2 = document.getElementById('question_2');
const q2a1 = document.getElementById('q2_a1');
const q2a2 = document.getElementById('q2_a2');
const q2a3 = document.getElementById('q2_a3');
const q2a4 = document.getElementById('q2_a4');

const Q3Form = document.querySelector('.q3');          // Question 3 Form
const q3 = document.getElementById('question_3');
const q3a1 = document.getElementById('q3_a1');
const q3a2 = document.getElementById('q3_a2');
const q3a3 = document.getElementById('q3_a3');
const q3a4 = document.getElementById('q3_a4');

const Q4Form = document.querySelector('.q4');          // Question 4 Form
const q4 = document.getElementById('question_4');
const q4a1 = document.getElementById('q4_a1');
const q4a2 = document.getElementById('q4_a2');
const q4a3 = document.getElementById('q4_a3');
const q4a4 = document.getElementById('q4_a4');

const resultForm = document.querySelector('.result');   // Result Form
const againButton = document.getElementById('again');

let q1_set; // Question Set Form
let q2_set;
let q3_set;
let q4_set;

const Score_1 = document.getElementById('score_1');     // to change score
const Score_2 = document.getElementById('score_2');
const Score_3 = document.getElementById('score_3');
const Score_4 = document.getElementById('score_4');
const Score_f = document.getElementById('final_score');

// Question and Answer Set
const QandA = [
    {
        question: 'Which one is NOT a legal variable name?',
        answer1: '_myvar',
        answer2: 'Myvar',
        answer3: 'my_var',
        answer4: 'my-var',
        correct: 'a4',
    },
    {
        question: 'What is a correct syntax to output "Hello World" in Python?',
        answer1: 'print("Hello World")',
        answer2: 'p("Hello World")',
        answer3: 'echo("Hello World");',
        answer4: 'echo "Hello World"',
        correct: 'a1',
    },
    {
        question: 'How do you insert COMMENTS in Python code?',
        answer1: '/*This is a comment*/',
        answer2: '#This is a comment',
        answer3: '//This is a comment',
        answer4: 'None of the above',
        correct: 'a2',
    },
    {
        question: 'What is the correct syntax to output the type of a variable or object in Python?',
        answer1: 'print(typeof(x))',
        answer2: 'print(typeof x)',
        answer3: 'print(typeOf(x))',
        answer4: 'print(type(x))',
        correct: 'a4',
    },
    {
        question: 'What is the correct file extension for Python files?',
        answer1: '.pt',
        answer2: '.pyt',
        answer3: '.pyth',
        answer4: '.py',
        correct: 'a4',
    },
]

startButton.addEventListener('click', start);
againButton.addEventListener('click', again);


init();    // to initialize forms

function init() {
    Q1Form.style.display = "none";
    Q2Form.style.display = "none";
    Q3Form.style.display = "none";
    Q4Form.style.display = "none";
    resultForm.style.display = "none";
    Score_1.innerText = "0";
}

function start() {   // start the quiz and pick the question
    mainForm.style.display = "none";
    randomPick();
    Q1Form.style.display = "grid";
}

function randomPick() {  // pick the question randomly at the QandA list
    let random_list = [];  // <------------referred on google----------------
    for (let i = 0; i < 4; i++) {
        let random_num = Math.floor(Math.random() * QandA.length);
        if (random_list.indexOf(random_num) === -1) {
            random_list.push(random_num);
        }
        else {
            i--;
        }
    }                      // ------------referred on google---------------->
                            
    q1_set = QandA[random_list[0]];
    q1.innerText = q1_set.question;
    q1a1.innerText = q1_set.answer1;
    q1a2.innerText = q1_set.answer2;
    q1a3.innerText = q1_set.answer3;
    q1a4.innerText = q1_set.answer4;

    q2_set = QandA[random_list[1]];
    q2.innerText = q2_set.question;
    q2a1.innerText = q2_set.answer1;
    q2a2.innerText = q2_set.answer2;
    q2a3.innerText = q2_set.answer3;
    q2a4.innerText = q2_set.answer4;

    q3_set = QandA[random_list[2]];
    q3.innerText = q3_set.question;
    q3a1.innerText = q3_set.answer1;
    q3a2.innerText = q3_set.answer2;
    q3a3.innerText = q3_set.answer3;
    q3a4.innerText = q3_set.answer4;

    q4_set = QandA[random_list[3]];
    q4.innerText = q4_set.question;
    q4a1.innerText = q4_set.answer1;
    q4a2.innerText = q4_set.answer2;
    q4a3.innerText = q4_set.answer3;
    q4a4.innerText = q4_set.answer4;
}

function submit_q1(event) {  // check the answer, change the color the answer button and go to next page
    console.log(event.id);
    if (event.id == q1_set.correct) {
        event.style.backgroundColor = "green";
        score = parseInt(score) + 1;
        Score_1.innerText = score;
        setTimeout(() => {
            Q1Form.style.display = "none";
            event.style.backgroundColor = "white";
            Q2Form.style.display = "grid";
            Score_2.innerText = score;
        }, 1500);
    }
    else {
        event.style.backgroundColor = "red";
        Score_1.innerText = score;
        setTimeout(() => {
            Q1Form.style.display = "none";
            event.style.backgroundColor = "white";
            Q2Form.style.display = "grid";
            Score_2.innerText = score;
        }, 1500);
    }
}

function submit_q2(event) {  // check the answer, change the color the answer button and go to next page
    console.log(event.id);
    if (event.id == q2_set.correct) {
        event.style.backgroundColor = "green";
        score = parseInt(score) + 1;
        Score_2.innerText = score;
        setTimeout(() => {
            Q2Form.style.display = "none";
            event.style.backgroundColor = "white";
            Q3Form.style.display = "grid";
            Score_3.innerText = score;
        }, 1500);
    }
    else {
        event.style.backgroundColor = "red";
        Score_2.innerText = score;
        setTimeout(() => {
            Q2Form.style.display = "none";
            event.style.backgroundColor = "white";
            Q3Form.style.display = "grid";
            Score_3.innerText = score;
        }, 1500);
    }
}

function submit_q3(event) {  // check the answer, change the color the answer button and go to next page
    console.log(event.id);
    if (event.id == q3_set.correct) {
        event.style.backgroundColor = "green";
        score = parseInt(score) + 1;
        Score_3.innerText = score;
        setTimeout(() => {
            Q3Form.style.display = "none";
            event.style.backgroundColor = "white";
            Q4Form.style.display = "grid";
            Score_4.innerText = score;
        }, 1500);
    }
    else {
        event.style.backgroundColor = "red";
        Score_3.innerText = score;
        setTimeout(() => {
            Q3Form.style.display = "none";
            event.style.backgroundColor = "white";
            Q4Form.style.display = "grid";
            Score_4.innerText = score;
        }, 1500);
    }
}

function submit_q4(event) {  // check the answer, change the color the answer button and go to result page
    console.log(event.id);
    if (event.id == q4_set.correct) {
        event.style.backgroundColor = "green";
        score = parseInt(score) + 1;
        Score_4.innerText = score;
        setTimeout(() => {
            Q4Form.style.display = "none";
            event.style.backgroundColor = "white";
            resultForm.style.display = "grid";
            Score_f.innerText = "Total score: " + score;
        }, 1500);
    }
    else {
        event.style.backgroundColor = "red";
        Score_4.innerText = score;
        setTimeout(() => {
            Q4Form.style.display = "none";
            event.style.backgroundColor = "white";
            resultForm.style.display = "flex";
            Score_f.innerText = "Total score: " + score;
        }, 1500);
    }
}

function again() {  // again start the quiz, and pick the question randomly
    resultForm.style.display = "none";
    randomPick();
    Q1Form.style.display = "grid";
    score = "0";
    Score_1.innerText = "0";
}