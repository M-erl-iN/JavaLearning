public class Num2 {
    public static void print_massive(int[] arr) 	{
		String str = "{";
		for (int i = 0; i < arr.length - 1; i++) {
			str += arr[i] + ", ";
		}
        str += arr[arr.length - 1];
		System.out.println(str + "}");
	}
    public static int[] union(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0;i < b.length; i++) {
            c[i + a.length] = b[i];
        }
        return c;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 4, 5, 6, 7};
        print_massive(union(a, b));
    }
}
