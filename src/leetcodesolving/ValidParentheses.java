package QuestionsSolving;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s= "([{}])";
        System.out.println(isValid(s));
    }


    static boolean isValid(String s) {
        Stack <Character> stack= new Stack<>();
        if((s.length()%2!=0) || (s.isEmpty())){
            return false;
        }
        for (int i = 0; i <s.length() ; i++) {
            char a = s.charAt(i);

            if(a=='(' ||  a== '[' || a== '{') {
                stack.push(a);
            }
            else if(a == ')' && stack.pop() != '(') {return false;}
            else if(a == ']' && stack.pop() != '['){return false;}
            else if(a == '}' && stack.pop() != '{'){return false;}
        }
        return stack.empty();
    }
}