const Sequelize = require('sequelize')
const sequelize = new Sequelize('exemplo' , 'root', '', {
    host: 'localhost',
    dialect: 'mysql',
})

sequelize.authenticate().then(function(){
    console.log('Conectado ao banco de dados')
}).catch(function(erro){
    console.log('Erro ao conectar ao banco de dados: ' + erro)
})

const Agendamentos = sequelize.define('agendamentos',{
    nome: {
        type: Sequelize.STRING
    },
    email: {
        type: Sequelize.STRING
    },
    telefone: {
        type: Sequelize.STRING
    },
    cpf: {
        type: Sequelize.STRING
    },
    data: {
        type: Sequelize.STRING
    },
    hora: {
        type: Sequelize.STRING
    }
})

//Agendamentos.sync({force: false})

Agendamentos.create({
    nome: 'João',
    email: 'joao@gmail.com',
    telefone: '123456789',
    cpf: '12345678901',
    data: '2020-01-01',
    hora: '10:00'

})