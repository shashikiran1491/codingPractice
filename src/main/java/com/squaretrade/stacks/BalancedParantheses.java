import java.util.EmptyStackException;
import java.util.Stack;

/**
 *  i/p = {([])}
 *  o/p = true
 *
 *  i/p = ([]
 *  o/p = false
 *
 *
 */

public class BalancedParantheses {

    /**
     *  }
     *  )
     *  ]
     *  [
     *  (
     *  {
     */

    public static void main(String[] args) {
        //String str = "{([])}";
        //String str1 = "()";
        String str2 = "([]";

        System.out.println(checkBalanced(str2));
    }

    private static boolean checkBalanced(String str) {

        Stack<Character> stack = new Stack();

        for(int i = 0; i < str.length(); i++) {

            if(str.charAt(i) == '{' || str.charAt(i) == '(' || str.charAt(i) == '[') {
                stack.push(str.charAt(i));
            } else if(!stack.isEmpty() && (str.charAt(i) == '}' || str.charAt(i) == ']' || str.charAt(i) == ')')) {
                if(str.charAt(i) == '}' && stack.peek() == '{') {
                    stack.pop();
                } else if(str.charAt(i) == ']' && stack.peek() == '[') {
                    stack.pop();
                } else if (str.charAt(i) == ')' && stack.peek() == '(') {
                    stack.pop();
                }
            }
        }

        if(!stack.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
}

