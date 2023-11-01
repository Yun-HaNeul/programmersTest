class Solution {
    public int[] solution(int[] num_list) {
        int listLength = num_list.length;
        
        int[] answer = new int[listLength + 1];
        
        System.arraycopy(num_list,0,answer,0,listLength);
        answer[listLength] = answer[listLength - 1] > answer[listLength - 2] ? answer[listLength - 1] - answer[listLength - 2] : answer[listLength - 1] * 2;
        return answer;
    }
}