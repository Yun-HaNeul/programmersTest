function solution(ineq, eq, n, m) {
    var answer = 0;
    if(ineq === ">"){
        if(eq === "=") answer = n >= m ? 1 : 0;
        if(eq === "!") answer = n > m ? 1 : 0;
    }else if(ineq === "<"){
        if(eq === "=") answer = n <= m ? 1 : 0;
        if(eq === "!") answer = n < m ? 1 : 0;
    }
    return answer;
}