import java.util.Scanner;

public class Table {
   // Print multiplication table of any number entered by the user.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number is: ");
        int num = sc.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(num+" * "+ i +" = " + num*i);
        }
        sc.close();
        
    }
}
