import java.util.Scanner;

public class ReverseNumber {
   // Reverse a number using loops (e.g., 123 → 321).
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num;

        int rev = 0;

        // loop to reverse
        while (num != 0) {
            int digit = num % 10;     // last digit
            rev = rev * 10 + digit;   // add digit to reversed number
            num = num / 10;           // remove last digit
        }

        System.out.println("Original number: " + original);
        System.out.println("Reversed number: " + rev);

        sc.close();
    }
}
