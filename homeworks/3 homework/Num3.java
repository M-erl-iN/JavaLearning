public class Num3 {
    public static String reverse(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += str.charAt(str.length() - i - 1);
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(reverse("Test"));
    }
}
