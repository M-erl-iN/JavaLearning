package controlWork;
import java.util.Scanner;
import java.lang.Math;


public class Num2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max_len = 1;
        int temp_len = 1;
        int last_number;
        int number = scanner.nextInt();
        while (number != -1) {
            last_number = number;
            number = scanner.nextInt();
            if (number > last_number) {
                temp_len++;
            } else {
                max_len = Math.max(max_len, temp_len);
                temp_len = 1;
            }
        }
        max_len = Math.max(max_len, temp_len);
        System.out.println(max_len);
    }
}
