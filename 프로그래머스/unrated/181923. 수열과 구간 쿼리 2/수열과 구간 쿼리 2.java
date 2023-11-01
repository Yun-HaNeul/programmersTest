class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        ///arr = [0,1,2,4,3,] / queries = [[0, 4, 2],[0, 3, 2],[0, 2, 2]]
        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            int minGreater = -1;  // 초기값을 -1로 설정
            
            for (int j = s; j <= e; j++) {
                if (arr[j] > k) {
                    if (minGreater == -1 || arr[j] < arr[minGreater]) {
                        minGreater = j;
                    }
                }
            }
            
            answer[i] = (minGreater == -1) ? -1 : arr[minGreater];
        }
        
        return answer;
    }
}