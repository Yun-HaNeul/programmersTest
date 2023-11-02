import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        while(n > 0){
            list.add(n);
            if(n == 1) break;
            if(n % 2 == 0){
                n /= 2;
            }else {
                n = 3 * n + 1;
            }
            
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}