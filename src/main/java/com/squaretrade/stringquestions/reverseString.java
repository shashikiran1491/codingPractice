package stringquestions;

/**
 *
 * Input: str = i.like.this.program.very.much
 * Output: much.very.program.this.like.i
 *
 *
 */

public class reverseString {

    public static void main(String[] args) {

        String str = "i.like.this.program.very.much";

        String[] arr = str.split("\\.");

        StringBuffer sb = new StringBuffer();

        for(int i=arr.length-1; i>=0; i--) {
            sb.append(arr[i]);

            if(i != 0) {
                sb.append(".");
            }
        }

        System.out.println(sb.toString());
    }



}
