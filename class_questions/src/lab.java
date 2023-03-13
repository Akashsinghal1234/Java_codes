import java.util.Scanner;

public class lab {

    //to initialize the array
    public static void main(String[] args) {
        int size;
        int [] values = {1,2,3,4,5,6,7,9};
        size = values.length ;
        System.out.println(size);


        Scanner sc = new Scanner(System.in);
        // taking input from the user

        int arr[] = new int [5];
        for (int i = 0 ; i < arr.length ; i ++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0 ; i < arr.length ; i++ ) {
            System.out.println(arr[i]);
        }
    }
}


/* wap to accept the 1d array and display the array and the sum
wap to check a number exist in program or not
wap to reverse the array
wap to create 2*2 matrix and display the sum
wap to accept a 3*3 matrix from user and display the left diganals onli
 */




