import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int aLeng = a.length();
        
        if(1 <= aLeng && aLeng <= 10){
           for(int i = 0; i < aLeng; i++){
               char target = a.charAt(i);
               System.out.println(target);
           }
        }else {
            System.out.println("문자열의 길이 제한은 1~10입니다");
        }
    }
}