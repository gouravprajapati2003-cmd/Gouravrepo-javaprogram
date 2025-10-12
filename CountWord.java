public class CountWord {
    public static void main(String[] args) {
        String str = "  This is    RDEC Gzb    in Duhai  ";
        str = str.trim();
        int wordCount = 0;
        for (int i=0; i< str.length(); i++) {
            if (str.charAt(i) == ' '&&str.charAt(i+1) != ' ') {
                wordCount++;
            }
        }
        System.out.println(wordCount + 1);

    }
    
}
