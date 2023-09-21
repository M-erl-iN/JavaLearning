import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        while(true) {
            int x = scanner.nextInt();
            if(x == 0) {
                break;
            }
            sum += x;
        }

        System.out.println(sum);
    }
}

