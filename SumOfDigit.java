public class SumOfDigit {
    public static void main(String[] args) {
        int num = 8521;
        int sum = 0;

        while (num != 0) {
        int last = num % 10;
        sum = sum + last;
        num = num/10;
        }
        System.out.println("sumofdigit"+sum);

        

        }
    }
    

