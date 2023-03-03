import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("welcome , pls enter your marks of five subject : ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int e = in.nextInt();

        int sum = a + b + c + d + e ;
        int result = sum / 5;

        System.out.println(result);

    }
}