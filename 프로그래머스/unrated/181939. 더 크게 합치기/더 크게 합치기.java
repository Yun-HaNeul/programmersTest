class Solution {
    public int solution(int a, int b) {
        String ab = String.valueOf(a) + String.valueOf(b);
        String ba = String.valueOf(b) + String.valueOf(a);
        
        int intAb = Integer.parseInt(ab);
        int intBa = Integer.parseInt(ba);
        
        return (intAb > intBa) ? intAb : intBa;
    }
}