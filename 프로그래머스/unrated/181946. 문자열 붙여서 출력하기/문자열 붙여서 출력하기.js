const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [];

rl.on('line', function (line) {
    input = line.split(' ');
}).on('close', function () {
    str1 = input[0];
    str2 = input[1];
    
    if(str1.length >= 1 && str2.length <= 10){
        console.log(`${str1}${str2}`);
    }else {
        console.log("문자열의 제한은 1 <= str1, str2 <= 10 입니다.")
    }
});