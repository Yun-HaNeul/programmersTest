import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int a1 = 0;
        int b1 = 0;
        
        if(a >= 1) {a1 = a;}
        if(b <= 100) {b1 = b;}

        System.out.printf("%d + %d = %d", a1, b1, a1 + b1);
    }
}