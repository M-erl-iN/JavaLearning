import java.util.Scanner;


public class Hard {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
        double r = (double) scan.nextInt();
	for (double x=r * -1; x <= r; x ++) {
	    String line = new String();
	    for (double y=r * -1; y <= r; y ++) {
		if (-1 * r <= x * x + y * y - r * r && x * x + y * y - r * r <= r) {
		    line += "[]";
		} else {
		    line += "==";
		}
	    }
	    System.out.println(line);
	}
    }
}