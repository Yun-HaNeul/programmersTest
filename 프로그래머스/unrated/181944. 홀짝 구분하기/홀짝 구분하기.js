const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [];

rl.on('line', function (line) {
    input = line.split(' ');
}).on('close', function () {
    n = Number(input[0]);
    
    if(1 <= n && n <= 1000){
        const divide = n % 2;
        let str = "is";
        
        divide ? str += " odd" : str += " even";
        
        console.log(`${n} ${str}`);
    }else {
        console.log("숫자의 범위는 1 <= n <= 1000 입니다.")
    }
    
});