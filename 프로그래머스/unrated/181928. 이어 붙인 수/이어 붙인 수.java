class Solution {
    public int solution(int[] num_list) {
        String even = "";
        String odd = "";
        int answer = 0;
        for(int num : num_list){
            if(num % 2 == 1){
                even += Integer.toString(num);
            }else {
                odd += Integer.toString(num);
            }
        }
        answer = Integer.parseInt(even) + Integer.parseInt(odd);
        return answer;
    }
}