class Solution {
    public int solution(int a, int b) {
        int addAb = Integer.parseInt("" + a + b);
        int multiplyAb = 2 * a * b;
        int answer = (addAb == multiplyAb) ? addAb : (addAb > multiplyAb) ? addAb : multiplyAb;
        
        return answer;
    }
}