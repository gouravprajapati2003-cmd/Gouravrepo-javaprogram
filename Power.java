public class Power {
    public static void main(String[] args) {
        int base = 7;
        int expo = 8;
        int power = 1;
        for(int i=0; i<expo; i++){
            power = power * base;
        }
        System.out.println(power);
    }
    
}
