//------------------For define model in DB-----------------
const Sequelize = require('sequelize');

module.exports = class Contact extends Sequelize.Model {
  static init(sequelize) {
    return super.init({
      content: {
        type: Sequelize.STRING(150),
        allowNull: false,
      },
    }, {
      sequelize,
      timestamps: true,
      underscored: false,
      modelName: 'Contact',
      tableName: 'contacts',
      paranoid: false,
      charset: 'utf8',
      collate: 'utf8_general_ci',
    });
  }

  static associate(db) {
    db.Contact.belongsTo(db.User);
  }
};