import java.util.Scanner;


public class Num2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int temp, elem = -1;
        Boolean flag, answer = false;
        while (elem != 0) {
            elem = scan.nextInt();
            flag = true;
            temp = elem;
            while (temp != 0) {
                if (temp % 2 == 1) {
                    flag = false;
                    break;
                }
                temp = temp / 10;
            }
            if (flag) {
                answer = true;
            }
        }
        System.out.println(answer); 
    }
}