//Print the first 10 Fibonacci numbers.
public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;  // number of terms
        int a = 0, b = 1;

        System.out.println("First " + n + " Fibonacci numbers:");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " "); // print current number
            int next = a + b;          // calculate next number
            a = b;                     // shift forward
            b = next;
        }
    }
}
