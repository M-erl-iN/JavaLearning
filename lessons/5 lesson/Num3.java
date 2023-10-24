import java.util.Scanner;


public class Num3 {
    public static void print_status(int[] status) {
        for (int i = 0; i < 10 ; i++) {
            System.out.println("|  " + i + ": " + status[i] + " times  |"); 
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int temp = scan.nextInt(), last_elem = -1;
        int[] status = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        while (temp != last_elem) {
            status[temp] += 1;
            temp = scan.nextInt();
        }
        print_status(status);
    }
}