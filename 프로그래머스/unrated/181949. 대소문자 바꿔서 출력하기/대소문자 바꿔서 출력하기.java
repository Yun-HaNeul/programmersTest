import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println(hasAlpha(a));
    }
    
    public static String hasAlpha(String a){
    String value = "";
    if (a == null) 
        return "문자열이 비었습니다.";
    
    for (int i = 0; i < a.length(); i++) {
        char c = a.charAt(i);
        if (!Character.isAlphabetic(c)) {
            return "알파벳이 아닌 것이 포함되어있습니다.";
        }
        if(Character.isUpperCase(c)){
            value += Character.toLowerCase(c);
        }else {
             value += Character.toUpperCase(c);
        }
    }
    return value;
    }
}
