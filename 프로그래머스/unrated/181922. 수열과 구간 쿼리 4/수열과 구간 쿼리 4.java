class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int[] query : queries){
            int s = query[0];
            int e = query[1];
            int k = query[2];
            
            for(int i = s; i <= e; i++){
                int temp = arr[i];
                if(i % k == 0) arr[i] = temp + 1;
            }
        }
        return arr;
    }
}