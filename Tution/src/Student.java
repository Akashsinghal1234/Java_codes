import java.util.Scanner;

import static java.lang.Math.ceil;

public class Student {
    String name;
    long roll_no;
    int[] marks = new int[5];
    void accept(){
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < marks.length; i++) {
            marks[i] = in.nextInt();
        }
    }
    void displayResult(){
        for (int mark : marks) {
            System.out.println("Marks are : " + mark);
        }
    }

    void avgResult(){
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        System.out.println("Average is : " + ceil(sum/ marks.length));
    }


}
