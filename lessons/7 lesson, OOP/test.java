import java.util.Scanner;


public class test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n == 0) {
            System.out.println("001");
        } else if (n == 1) {
            System.out.println("005");
        } else if (n == 2) {
            System.out.println("025");
        } else {
            if (n % 2 == 0) {    
                System.out.println(625);
            } else {
                System.out.println(125);
            }
        }
    }
}