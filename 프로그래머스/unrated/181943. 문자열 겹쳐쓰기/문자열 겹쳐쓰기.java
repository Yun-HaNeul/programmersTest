public class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        if (s < 0 || s >= my_string.length()) {
            // 인덱스 s가 유효하지 않으면 원래 문자열 그대로 반환
            return my_string;
        }

        int endIndex = Math.min(s + overwrite_string.length(), my_string.length());
        StringBuilder result = new StringBuilder();

        // s 이전 부분
        result.append(my_string.substring(0, s));

        // overwrite_string 추가
        result.append(overwrite_string);

        // 나머지 부분
        result.append(my_string.substring(endIndex));

        
        return result.toString();
    }

}