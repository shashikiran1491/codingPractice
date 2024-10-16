import java.util.Stack;

public class ReverseString1 {

    public static void main(String[] args) {

        String str = "GeeksforGeeks";

        Stack<Character> stack = new Stack();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        StringBuffer sb = new StringBuffer();

        while (!stack.isEmpty())
            sb.append(stack.pop());

        System.out.println(sb.toString());

    }



}


