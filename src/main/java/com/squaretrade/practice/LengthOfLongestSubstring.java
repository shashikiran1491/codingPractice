import java.util.LinkedHashSet;

public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        /**
         * Find the longest substring without repeating characters
         * i/p : abcabcbb
         * o/p : abc
         */

        String str = "pkewss";
        char[] ch =  str.toCharArray();
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        int i = 0;
        int j = 0;
        int maxLength = 0;

        while (j < ch.length) {
           if(!set.contains(ch[j])) {
               set.add(ch[j]);
               j++;
           }
           else {
               set.remove(ch[i]);
               i++;
           }

           if(set.size() > maxLength) {
               maxLength = set.size();
           }
        }
        System.out.println(maxLength);
    }
}
