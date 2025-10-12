import java.util.Scanner;

public class VowelsConstant {
    public static void main(String[] args) {
        //Check whether a character is a vowel or consonant.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a charcter: ");
        char ch = sc.next().toLowerCase().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                System.out.println(ch + " is a vowel");
            }else{
                System.out.println(ch + " is a constant");
            }
        }
        sc.close();
    }
}
