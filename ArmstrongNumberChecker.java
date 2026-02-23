public class ArmstrongNumberChecker {
    public static void main(String[] args) {
        int sum = 0;
        int num = 153;
        int len = String.valueOf(num).length();
      while (num != 0) {
        int base = num % 10;
        int exp = len;
        int power =1;
        for(int i=0; i<exp; i++){
            power = power * base;
        }
        sum = sum + power;
        num = num / 10;
    }
    if ( sum == num) {
        System.out.println("The number is Armstrong");
    } else {
        System.out.println("The number is not Armstrong");
    }
   
    }
}
   

