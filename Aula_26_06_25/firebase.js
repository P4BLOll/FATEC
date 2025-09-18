// firebase.js
const firebase = require("firebase/app");
require("firebase/auth");

const firebaseConfig = {
  apiKey: "AIzaSyDLuvGv1-pwUbi4iXyZ5Whw5aSDiAHZPzk",
  authDomain: "aula26-06.firebaseapp.com",
  projectId: "aula26-06",
  storageBucket: "aula26-06.firebasestorage.app",
  messagingSenderId: "641870498",
  appId: "1:641870498:web:e08e38fc0f7effd7a585fb"
};

firebase.initializeApp(firebaseConfig);

module.exports = firebase;
