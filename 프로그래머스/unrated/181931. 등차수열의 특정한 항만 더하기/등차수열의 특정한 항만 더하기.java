class Solution {
    public int solution(int a, int d, boolean[] included) {
        //a_{n}=a_{x}+(n-x)d
        int answer = 0;
        for(int i = 0; i < included.length; i++){
            if(included[i]){
                answer += a + (i * d);
            }
        }
        return answer;
    }
}