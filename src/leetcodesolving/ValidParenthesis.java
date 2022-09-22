package stack;

import java.util.ArrayDeque;
import java.util.Deque;

//Input: s = "()[]{}"
//Output: true

//Input: s = "(]"
//Output: false
public class ValidParenthesis {
    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }


    static boolean isValid(String s) {
        Deque<Character> stack= new ArrayDeque<Character>();
        //Stack <String > stack = new Stack<>();
        if(s.length() %2 != 0) return false;

        for (int i = 0; i <s.length() ; i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            }else{
                return false;
            }
        }
        return stack.isEmpty();
    }
}
