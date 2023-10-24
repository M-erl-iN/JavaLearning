import java.util.Scanner;


public class Figures {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        boolean rule1, rule2, rule3;
        rule1 = (x >= -5 & x <= 0 & y >= 0 & y <= 10);
        rule2 = (x >= 0 & x <= 10 & y >= 0 & y <= 10 & y <= 10 - x);
        rule3 = ((x * x + y * y <= 100) & y >= -5 & y <= 0);
        System.out.println(rule1 + " " + rule2 + " " + rule3);
        if (rule1 | rule2 | rule3) {
            System.out.println("+");
        } else {
            System.out.println("-");
        }
    }
}