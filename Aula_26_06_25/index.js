const admin = require("firebase-admin");
const express = require("express");
const bodyParser = require("body-parser");
const cors = require("cors");

const serviceAccount = require("./serviceAccountKey.json");

admin.initializeApp({
  credential: admin.credential.cert(serviceAccount),
});

const app = express();
app.use(cors());
app.use(bodyParser.json());

app.post("/register", async (req, res) => {
  const { email, password } = req.body;
  try {
    const user = await admin.auth().createUser({ email, password });
    res.status(201).send({ uid: user.uid, email: user.email });
  } catch (error) {
    res.status(400).send({ error: error.message });
  }
});

app.post("/login", async (req, res) => {
  res.status(501).send({
    error: "Login por email/senha deve ser feito no frontend (navegador) com firebase.auth().",
  });
});

app.get("/private", async (req, res) => {
  const token = req.headers.authorization?.split("Bearer ")[1];
  if (!token) return res.status(401).send({ error: "Token ausente" });

  try {
    const decoded = await admin.auth().verifyIdToken(token);
    res.send({ message: "Autenticado!", uid: decoded.uid });
  } catch (error) {
    res.status(401).send({ error: "Token inválido" });
  }
});

app.listen(3000, () => {
  console.log("Servidor rodando em http://localhost:3000");
});
