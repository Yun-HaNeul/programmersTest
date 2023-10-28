class Solution {
    
    public String hasSmallLetter(String str1, String str2){
        if (!str1.matches("^[a-z]+$") || !str2.matches("^[a-z]+$")) {
            return "두 문자열은 알파벳 소문자로만 이루어져야 합니다.";
        }
        
        int str1Length = str1.length();
        int str2Length = str2.length();
        
        if(str1Length != str2Length){
            return "두 문자열의 길이가 같아야 합니다.";
        }
        
        return matchResult(str1, str2); 
    }
    
    public String matchResult(String str1, String str2){
        int str1Length = str1.length();
        StringBuilder answer = new StringBuilder(); 
        for(int i = 0; i < str1Length; i++){
            answer.append(str1.charAt(i));
            answer.append(str2.charAt(i));
        }
        return answer.toString();
    }

    public String solution(String str1, String str2) {
        return hasSmallLetter(str1, str2);
    }
}