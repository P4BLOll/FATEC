var http = require('http');

http.createServer(function(req, res){
    res.end("Mensagem de Erro")
}).listen(8081);

console.log("Servidor está ativo");