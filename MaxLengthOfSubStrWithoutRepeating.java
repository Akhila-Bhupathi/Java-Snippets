import java.util.*;

public class LongestMaxSubString {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter new String");
       String s=sc.next();
       LongestMaxSubString l = new LongestMaxSubString();
       System.out.println(l.MaxSubStrLength(s));
       
    }
    
    public int MaxSubStrLength(String str) {
        int i=0;
        int j=0;
        int max=0;
        
        HashSet<Character> h = new HashSet<>();
        
        while(j<str.length()) {
            if(h.contains(str.charAt(j))) {
                h.remove(str.charAt(i));
                i++;
            } else {
                h.add(str.charAt(j));
                j++;
                max=Math.max(h.size(),max);
            }
        }
        return max;
    }
}
