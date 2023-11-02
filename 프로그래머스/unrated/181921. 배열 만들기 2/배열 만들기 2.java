import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            if (isZeroFiveNumber(i)) {
                list.add(i);
            }
        }
        
        if (list.isEmpty()) {
            return new int[]{-1};
        } else {
            Collections.sort(list);
            int[] result = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                result[i] = list.get(i);
            }
            return result;
        }
    }
    
    // 주어진 숫자가 "0"과 "5"로만 이루어진 숫자인지 확인하는 함수
    private boolean isZeroFiveNumber(int num) {
        while (num > 0) {
            int digit = num % 10;
            if (digit != 0 && digit != 5) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}