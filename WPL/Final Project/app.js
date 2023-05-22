// The backend part of this Web Project was implemented using Node.JS
// And much of this code was written with reference to ZeroCho's lecture of inflearn

const express = require('express');
const cookieParser = require('cookie-parser');
const nunjucks = require('nunjucks');
const morgan = require('morgan');
const path = require('path');
const session = require('express-session');
const passport = require('passport');

const pageRouter = require('./routes/page');
const authRouter = require('./routes/auth');
const postRouter = require('./routes/post');
const { sequelize } = require('./models');
const passportConfig = require('./passport');


const app = express();

app.set('port', 8000);
app.set('view engine', 'html');
nunjucks.configure('views', {
    express: app,
    watch: true,
});
sequelize.sync({ force: false})
    .then(() => {
        console.log('DB Connection Success');
    })
    .catch((err) => {
        console.error(err);
    });
passportConfig();    

app.use(morgan('dev'));
app.use(express.static(path.join(__dirname, 'public')));
app.use('/img', express.static(path.join(__dirname, 'uploads')));
app.use(express.json());
app.use(express.urlencoded({ extended: true}));
app.use(cookieParser('ironfoot-cookie'));
app.use(session({
    resave: false,
    saveUninitialized: false,
    secret: 'ironfoot-cookie',
    cookie: {
        httpOnly: true,
        secure: false,
    },
}));

app.use(passport.initialize());
app.use(passport.session());

//<-----------------for Routing-----------------
app.use('/', pageRouter);
app.use('/auth', authRouter);
app.use('/post', postRouter);
//------------------for Routing---------------->

//<-----------------Routing Error-----------------
app.use((req, res, next) => {
    const error = new Error(`${req.method} ${req.url} Router isn't exist.`);
    error.status = 404;
    next(error);
});

app.use((err, req, res, next) => {
    res.locals.message = err.message;
    res.locals.error = process.env.NODE_ENV !== 'production' ? err : {};
    res.status(err.status || 500).render('error');
});
//------------------Routing Error---------------->

app.listen(app.get('port'), () => {
    console.log('Waiting on', app.get('port'));
});