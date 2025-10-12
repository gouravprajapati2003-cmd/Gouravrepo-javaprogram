import java.util.Scanner;

public class OddEven {
    //Write a program to check if a number is even or odd.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
       //int n = 5;
        if(n%2 == 0){
            System.out.println("num is even");
        }
        else{
            System.out.println("num is odd");
        }
        sc.close();

    }
}