//------------------For create model in DB-----------------
const Sequelize = require('sequelize');
const env = 'development';
const config = require('../config/config')[env];

const User = require('./user');
const Post = require('./post');
const Notice = require('./notice');
const Contact = require('./contact');

const db = {};
const sequelize = new Sequelize(
  config.database, config.username, config.password, config,
);

db.sequelize = sequelize;
db.User = User;
db.Post = Post;
db.Notice = Notice;
db.Contact = Contact;

User.init(sequelize);
Post.init(sequelize);
Notice.init(sequelize);
Contact.init(sequelize);

User.associate(db);
Post.associate(db);
Notice.associate(db);
Contact.associate(db);

module.exports = db;