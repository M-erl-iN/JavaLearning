package controlWork;
import java.util.Scanner;


public class Num3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] temp = scan.nextLine().split(" ");
        int[] array = new int[temp.length];
        for (int i = 0; i < temp.length; i++) {
            array[i] = Integer.parseInt(temp[i]);
        }

        int k = scan.nextInt();
        int[] new_array = new int[array.length];
        for (int i = 0; i < k; i++){
            new_array[array.length - k + i] = array[i];
        }
        for (int i = k; i < array.length; i++){
            new_array[i - k] = array[i];
        }
        
        print_massive(new_array);
    }

    public static void print_massive(int[] massive) {
        for (int j = 0; j < massive.length; j++) {
            System.out.print(massive[j] + " ");
        }
    }
}
