
const https=require('https');
const express =require('express');
const fs=require('node:fs');

const app=express();

app.use(express.json());
app.use('/ping',(req,res,next)=>{
    res.send("healthy").status(200);
});


const options = {
    key: fs.readFileSync('./certificates/key.pem'),
    cert: fs.readFileSync('./certificates/cert.pem',),
  };
  

https.createServer(options,app).listen(8000,()=>{
    console.log('https://localhost:8000')
});


