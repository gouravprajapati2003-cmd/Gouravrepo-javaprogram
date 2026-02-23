public class FactorialRecursion {

    int factorial(int num) {
        if (num <= 0) {
            return 1;   // 0! = 1
        }
        return num * factorial(num - 1);
    }

    public static void main(String[] args) {
        FactorialRecursion obj = new FactorialRecursion();
        int result = obj.factorial(5);
        System.out.println("Factorial is: " + result);
    }
}