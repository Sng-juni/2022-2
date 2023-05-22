//------------------Route Page for POST method -----------------
const express = require('express');
const multer = require('multer');
const path = require('path');
const fs = require('fs');

const { Post, Notice, Contact } = require('../models');
const { isLoggedIn } = require('./checklogin');

const router = express.Router();

//<----------------for Community Post----------------
try {
    fs.readdirSync('uploads');
} catch(error) {
    console.error('There is not upload folder, so create the folder.');
    fs.mkdirSync('uploads');
}
const upload = multer({
    storage: multer.diskStorage({
        destination(req, file, cb) {
            cb(null, 'uploads/');
        },
        filename(req, file, cb) {
            const ext = path.extname(file.originalname);
            cb(null, path.basename(file.originalname, ext) + Date.now() + ext);
        },
    }),
    limits: {filesize: 10 * 1024 * 1024},
});
router.post('/community/img', isLoggedIn, upload.single('img'), (req, res) => {
    res.json({ url: `/img/${req.file.filename}` });
});
const upload1 = multer();
router.post('/community', isLoggedIn, upload1.none(), async(req, res, next) => {
    if (req.body.content == '') {
        return res.send("<script>alert('Please Write the content'); history.back();</script>");
    }
    try {
        const post = await Post.create({
            content: req.body.content,
            img: req.body.url,
            UserId: req.user.id,
        });
        res.redirect('/community');
    } catch (error) {
        console.error(error);
        next(error);
    }
});
//----------------for Community Post---------------->
//<----------------for Notice Post----------------
router.post('/notice', isLoggedIn, async(req, res, next) => {
    if (req.body.content == '') {
        return res.send("<script>alert('Please Write the content'); history.back();</script>");
    }
    try {
        await Notice.create({
            content: req.body.content,
            UserId: req.user.id,
        });
        return res.redirect('/notice');
    } catch(error) {
        console.error(error);
        next(error);
    }
});
//----------------for Notice Post---------------->
//<----------------for Cotact Post----------------
router.post('/contact', isLoggedIn, async(req, res, next) => {
    if (req.body.content == '') {
        return res.send("<script>alert('Please Write the content'); history.back();</script>");
    }
    try{
        await Contact.create({
            nickname: req.body.nickname,
            content: req.body.content,
            UserId: req.user.id,
        });
        return res.redirect('/');
    } catch(error) {
        console.error(error);
        next(error);
    }
});
//----------------for Cotact Post---------------->

module.exports = router;