import java.util.Scanner;


public class Num1 {
    public static int pow(int a, int n) {
        int ans = a;
        for (int i = 1; i < n; i++) {
            ans = ans * a;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(); 
        int n = scan.nextInt();
        System.out.println(pow(a, n)); 
    }
}