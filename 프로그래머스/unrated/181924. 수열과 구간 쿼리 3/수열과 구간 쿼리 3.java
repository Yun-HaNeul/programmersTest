class Solution {
    public int[] solution(int[] arr, int[][] queries) {

        int a = 0;
        int b = 0;
        int temp = 0;
        
        for(int[] query : queries){
            a = query[0];
            b = query[1];
            temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
        return arr;
    }
}