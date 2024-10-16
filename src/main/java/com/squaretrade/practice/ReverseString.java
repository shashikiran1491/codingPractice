import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseString {

    public static void main(String a[]) {

        String str = "shashi";

        //reverseStringUsingStreams(str);

        //reverseStringUsingCharArray(str);

        System.out.println(reverseStringUsingRecursion(str));
    }

    private static void reverseStringUsingCharArray(String str) {
        char ch[] = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i=ch.length-1; i>=0; i--){
            sb.append(ch[i]);
        }
        System.out.println(sb.toString());
    }

    private static void reverseStringUsingStreams(String str) {
        StringBuilder sb1 = IntStream.range(0, str.length())
                .map(i -> str.charAt(str.length() - i - 1))
                .collect(StringBuilder::new, (sb, c) -> sb.append((char)c), StringBuilder::append);

        System.out.println(sb1.toString());
    }

    private static String reverseStringUsingRecursion(String str) {

        if(str.length() == 1) {
            return str;
        }

        return str.charAt(str.length()-1) + reverseStringUsingRecursion(str.substring(0, str.length()-1));

    }
}
