public class StarRecursion {
    void printData(int count) {
        if(count <=0) {
            return;
            
        }
        printData(count-1);
        System.out.print("*");
        
    }

    public static void main(String[] args) {
        StarRecursion sd = new StarRecursion();
        sd.printData(5);
    }
}
