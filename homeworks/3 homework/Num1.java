import java.util.Scanner;


public class Num1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i=0; i < n; i++) {
            System.out.println(" ".repeat(n - i) + "*".repeat(1 + i * 2));
        }
    }
}