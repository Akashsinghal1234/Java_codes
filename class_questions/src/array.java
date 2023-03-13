import java.util.Scanner;

public class array {

    public static void main(String[] args) {

        System.out.println("to take input and printing output");
        Scanner in = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
