package stringquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * i/p : I Am Not String
 * o/p : g ni rtS toNmAI
 *
 *
 */

public class reverseStringV2 {

    public static void main(String[] args) {

        String str = "I Am Not String";

        char[] ch = str.toCharArray();
        char[] resultArray = new char[ch.length];

        for(int i=0; i<ch.length; i++) {
            if(ch[i] == ' ') {
                resultArray[i] = ' ';
            }
        }



        int j=0;
        for(int i=ch.length-1 ; i>=0 ; i--) {
           if(ch[i] != ' ') {

               if(resultArray[j] == ' ') {
                   j++;
               }

               resultArray[j] = ch[i];
               j++;

           }
        }

        System.out.println(Arrays.toString(resultArray));

    }
}
