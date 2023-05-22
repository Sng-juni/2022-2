//------------------Route Page for GET method -----------------

const { response } = require('express');
const express = require('express');
const { User, Post, Notice, Contact } = require('../models');

const router = express.Router();

router.use((req, res, next) => {
    res.locals.user = req.user;
    next();
})

//<----------------for Home Page----------------
router.get('/', (req, res) => {
    res.render('home', {
        title: 'IronFoot',
    });
});
//----------------for Home Page---------------->
//<----------------for SignUp Page----------------
router.get('/signup', (req, res) => {
    res.render('signup', { title: 'IronFoot - Sign Up' });
});
//----------------for SignUp Page---------------->
//<----------------for Notice Page----------------
router.get('/notice', async(req, res, next) => {
    try {
        const contacts = await Notice.findAll({
            include: {
                model: User,
                attributes: ['id', 'nickname', 'group'],
            },
            order: [['createdAt', 'DESC']],
        });
        res.render('notice', {
            title: 'IronFoot - Notice',
            lists: contacts, 
        })
    } catch(err) {
        console.error(err);
        next(err);
    }
});
//----------------for Notice Page---------------->
//<----------------for Community Page----------------
router.get('/community', async(req, res) => {
    try {
        const posts = await Post.findAll({
            include: {
                model: User,
                attributes: ['id', 'nickname', 'group'],
            },
            order: [['createdAt', 'DESC']],
        });
        res.render('community', {
            title: 'IronFoot - Community',
            lists: posts,
        });
    }   catch(err) {
        console.error(err);
        next(err);
    }
});
//----------------for Community Page---------------->
//<----------------for Contact Us Page----------------
router.get('/contact', (req, res) => {
    res.render('contact', {
        title: 'IronFoot - Contact Us',
    });
});
//----------------for Contact Us Page---------------->
//<----------------for Profile Page----------------
router.get('/profile', (req, res) => {
    res.render('profile', {
        title: 'IronFoot - Profile',
    });
});
//----------------for Profile Page---------------->
//<----------------for Admin Page----------------
router.get('/admin', async(req, res, next) => {
    try {
        const contacts = await Contact.findAll({
            include: {
                model: User,
                attributes: ['id', 'nickname', 'group'],
            },
            order: [['createdAt', 'DESC']],
        });
        res.render('admin', {
            title: 'IronFoot - Admin Page',
            lists: contacts,
            user: req.user, 
        })
    } catch(err) {
        console.error(err);
        next(err);
    }
});
//----------------for Admin Page---------------->

module.exports = router;