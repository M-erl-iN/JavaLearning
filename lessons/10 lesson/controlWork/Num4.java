package controlWork;
import java.util.Scanner;

class Number1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int[] nums = {0, 0};
        int temp_num;

        for (int i = 0; i < number.length(); i++) {
            temp_num = Integer.parseInt(Character.toString(number.charAt(i)));
            nums[temp_num % 2] += temp_num;
        }

        if (nums[0] == nums[1]) {
            System.out.println("да");
        } else {
            System.out.println("нет");
        }
    }
}