class Solution {
    public int solution(int[] num_list) {
        int mulNum = 1;
        int sumNum = 0;
        for(int num : num_list){
            mulNum *= num;
            sumNum += num;
        }
        return mulNum < sumNum * sumNum ? 1 : 0;
    }
}