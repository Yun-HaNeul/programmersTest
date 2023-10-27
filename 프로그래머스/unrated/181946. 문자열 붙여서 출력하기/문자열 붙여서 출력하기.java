import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        try{
            int aLeng = a.length();
            int bLeng = b.length();
            
            if(1 <= aLeng && bLeng <= 10){
                String str1 = a;
                String str2 = b;
                
                System.out.println(str1+str2);
            }
        }finally {
            sc.close();
        }
    }
}