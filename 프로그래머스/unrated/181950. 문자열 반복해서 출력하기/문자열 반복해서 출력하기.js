const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [];

rl.on('line', function (line) {
    input = line.split(' ');
}).on('close', function () {
    str = input[0];
    n = Number(input[1]);
    value = "";
    if(1 <= input[0].length && input[0].length <= 10) str1 = str;
    
    if(1 <= n && n <= 5) n1 = n;
    
    for(let i = 1; i <= n1; i++){
        value += str1;
    }
    console.log(value);
});