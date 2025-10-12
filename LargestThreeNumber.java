public class LargestThreeNumber{
    //Find the largest of three numbers using if-else.

    public static void main(String[] args) {
        int a = 20; 
        int b = 50;
        int c = 100;
       
        if(a>b && a>c){
            System.out.println(a + " is the largest number");
        }
        else if(b>a && b>c){
            System.out.println(b + " is the largest number");
        }
        else{
            System.out.println(c + " is the largest number");
        }
    }
}

