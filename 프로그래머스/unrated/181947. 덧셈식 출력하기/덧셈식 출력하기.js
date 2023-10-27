const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [];

rl.on('line', function (line) {
    input = line.split(' ');
}).on('close', function () {
    let a = Number(input[0]);
    let b= Number(input[1]);
    
    if(a >= 1) a1 = a;
    if(b <= 100) b1 = b;
    
    console.log(`${a1} + ${b1} = ${a1 + b1}`)
    
});