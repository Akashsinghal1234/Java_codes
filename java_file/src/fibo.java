public class fibo {
    public static void main(String[] args) {
        int numTerms = 10;
        int prevNum = 0, currNum = 1;

        System.out.print("Fibonacci series up to " + numTerms + " terms: ");
        for (int i = 1; i <= numTerms; i++) {
            System.out.print(prevNum + " ");
            int nextNum = prevNum + currNum;
            prevNum = currNum;
            currNum = nextNum;
        }
    }
}
