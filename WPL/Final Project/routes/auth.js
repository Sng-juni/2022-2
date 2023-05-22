//------------------Route Page for Authenticating(login, logout, signup)-----------------
const express = require('express');
const passport = require('passport');
const bcrypt = require('bcrypt');
const User = require('../models/user');
const { isLoggedIn, isNotLoggedIn } = require('./checklogin');

const router = express.Router();

//<----------------for Create Account----------------
router.post('/signup', isNotLoggedIn, async(req, res, next) => {
    if (req.body.email == '') {
        return res.send("<script>alert('Please Enter your Email.');history.back();</script>");
    } else if (req.body.nickname == '') {
        return res.send("<script>alert('Please Enter your Nickname.');history.back();</script>");
    } else if (req.body.password == '') {
        return res.send("<script>alert('Please Enter your Password.');history.back();</script>");
    } else if (req.body.password != req.body.cpassword) {
        return res.send("<script>alert('Password does not Match!');history.back();</script>");
    } else if (req.body.group == '0') {
        return res.send("<script>alert('Please Select your Group.');history.back();</script>");
    }
    const {email, nickname, password, group} = req.body;
    try {
        const exUser = await User.findOne({ where: { email } });
        if (exUser) {
            return res.redirect('/signup?error=exist');
        }
        const hash = await bcrypt.hash(password, 10);
        await User.create({
            email,
            nickname,
            password: hash,
            group,
        });
        return res.redirect('/');
    } catch (error) {
        console.error(error);
        return next(error);
    }
});
//----------------for Create Account---------------->
//<----------------for Login----------------
router.post('/login', isNotLoggedIn, (req, res, next) => {
    passport.authenticate('local', (authError, user, info) => {
        if (authError) {
            console.error(authError);
            return next(authError);
        }
        if (!user) {
            return res.redirect(`/?loginError=${info.message}`);
        }
        return req.login(user, (loginError) => {
            if (loginError) {
                console.error(loginError);
                return next(loginError);
            }
            return res.redirect('/');
        });
    })(req, res, next);
});
//----------------for Login---------------->
//<----------------for Logout----------------
router.get('/logout', isLoggedIn, (req, res, next) => {
    req.logout((err) => {
      if (err) { return next(err); }
      req.session.destroy();
      res.redirect('/');
    });
  });
//----------------for Logout---------------->

module.exports = router;