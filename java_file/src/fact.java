public class fact {
    public static void main(String[] args) {
        int n = 5;
        int factorial = calcFactorial(n);
        System.out.println("Factorial of " + n + " is: " + factorial);
    }

    public static int calcFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calcFactorial(n-1); //
        }
    }
}