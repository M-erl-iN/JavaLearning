package controlWork;
import java.util.Scanner;

public class Num1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] result = new int[n][n];
        for (int i = 0; i < (n + n % 2) / 2; i++) {
            for (int j = i; j < n - i; j++) {
                result[i][j] = i + 1;
                result[n - i - 1][j] = i + 1;
                result[j][i] = i + 1;
                result[j][n - i - 1] = i + 1;
            }
        }
        print_massive(result);
    }


    public static void print_massive(int[][] massive) {
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive.length; j++) {
                System.out.print(massive[i][j] + " ");
            }
            System.out.println();
        }
    }
}
