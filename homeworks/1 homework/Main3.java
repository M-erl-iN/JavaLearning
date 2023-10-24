import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	int i = input.nextInt();
	boolean test = false;
 	while (i != 0) {
            if (i == 5) {
		test = true;
	    }
	    i = input.nextInt();
        }
	if (test) {
            System.out.println("YES");
	}
    }
}