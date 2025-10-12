public class RotateNumber {
    public static void main(String[] args) {
        int num = 12345;
        int rot = 22;
        int len = 5;
        rot = rot % len;

        int rightpart = num % (int)(Math.pow(10, rot));
        int leftpart = num / (int)(Math.pow(10, rot));
        int result = rightpart*(int)(Math.pow(10,(len- rot)))+ leftpart;
        System.out.println(result);
    }
    
}
