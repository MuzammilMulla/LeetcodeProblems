package stack;

import java.util.Stack;

//Input: s = "abbaca"
//Output: "ca"
//Explanation:
//For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.
// The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".
public class RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(removeDuplicates(s));
    }

    static String removeDuplicates(String s) {

        Stack <Character> stack = new Stack<>();

        for(Character c : s.toCharArray()){
            if(!stack.isEmpty() && stack.peek() == c){
                stack.pop();
            }
            else{
                stack.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) sb.append(stack.pop());
        return sb.reverse().toString();
    }
}
