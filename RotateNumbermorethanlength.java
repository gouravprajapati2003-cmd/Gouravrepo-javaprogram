public class RotateNumbermorethanlength {
    public static void main(String[] args) {
        int num = 12345;
        int rot = 24; 

        int len = String.valueOf(num).length();
        rot = rot % len;
        if (rot < 0) {
            
        }

        int rightpart = num % (int)(Math.pow(10, rot));
        int leftpart = num / (int)(Math.pow(10, rot));
        int result = rightpart * (int)(Math.pow(10, (len - rot))) + leftpart;

        System.out.println(result);
    }
}
