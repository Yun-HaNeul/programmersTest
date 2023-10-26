import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String a1 = a.trim();
        int aLeng = a1.length();
        
        if(aLeng >= 1 && aLeng <= 1000000){
            System.out.println(a1);
        }
        
    }
}