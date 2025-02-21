const express = require("express")
const app = express()

app.get("/", function(req, res){
    res.sendFile(__dirname + "/html/index.html")
})

app.get("/produtos/:item/:quantidade", function(req, res){
    res.send("<strong>Item:</strong> " + req.params.item + "<br><strong>Quantidade:</strong> " + req.params.quantidade)
})

app.listen(8081, function(){
    console.log("Servidor Web rodando na porta 8081")
})