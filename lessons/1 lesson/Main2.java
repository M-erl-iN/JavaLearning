import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int m = inp.nextInt(); int k = inp.nextInt();
	if (m % 3 != 0) {
            m = (m / 3 + 1) * 3;
	}
        int sum = 0;
	for(int i = m;i < k; i += 3) {
	    System.out.println(i);
	}
    }
}