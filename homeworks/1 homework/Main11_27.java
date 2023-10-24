import java.util.Scanner;


public class Main11_27 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if (1<=num && num<=18) {
			for (int i=1; i<10; i++) {
				for (int j=0; j<10; j++) {
					if (i+j==num) {
						System.out.println(i*10+j);
					}
				}
			}
		}
	}
}