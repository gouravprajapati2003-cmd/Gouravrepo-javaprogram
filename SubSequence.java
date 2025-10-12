import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(); // this is a list to store
        String str = "ABC";
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i); 

          if (list.isEmpty()) {
            list.add("");
            list.add(ch + "");
            continue;
          }   
          int listLen = list.size(); // 2 4 8 16 .....
          
          for(int j = 0; j<listLen; j++) {
            list.add(list.get(j) + ch);
          }
        }
        System.out.println(list);
        
    }
} // home work read two pointer, leetcode Q-134 know the Q demand,
