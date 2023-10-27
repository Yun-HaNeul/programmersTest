import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(1 <= n && n <= 1000){
            int divide = n % 2;
            String str = "";
            
            if(divide == 0) {
                str = "is even";
            }else {
                str = "is odd";
            }
            
            System.out.printf("%d %s", n, str);
        }
    }
}