import java.util.Scanner;


public class Test2 {
	public static void main(String[] args) {
		int x, y;
		Scanner input = new Scanner(System.in);
		x = input.nextInt();
		y = input.nextInt();
		System.out.println(x / y + " " + x % y + "/" + y);
	}
}