import java.util.Scanner;


public class Num2 {
	public static String[] in_array(String[] list_, String[] elems) {
		int ind = 0;
		for (int j=0; j<list_.length; j++) {
			if (list_[j] == null) {
				list_[j] = elems[ind];
				ind++;
			}
		}
		return list_;
	}
	public static void print_massive(String[] arr) 	{
		String str = "";
		for (int i = 0; i < arr.length; i++) {
			str += arr[i];
		}
		System.out.println(str);
	}
	public static void print_all_brackets(int x, int y, String[] list_) {
		if (y==x) {
			print_massive(list_);
		} else {
			for (int i=0; i<=list_.length; i++) {
				String[] elems = {"{", "}"};
				String[] list_new = new String[list_.length + 2];
				for (int j = 0; j < i; j++) {
					list_new[j] = list_[j];
				}
				list_new[i] = "{";
				list_new[i + 1] = "}";
				for (int j = i + 2; j < list_new.length; j++) {
					list_new[j] = list_[j - 2];
				}
				list_new = in_array(list_new, elems);
				print_all_brackets(x, y + 1, list_new);
			}
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int bracket_count = input.nextInt();
		String[] list_ = {"{", "}"};
		print_all_brackets(bracket_count, 1, list_);
	}
}