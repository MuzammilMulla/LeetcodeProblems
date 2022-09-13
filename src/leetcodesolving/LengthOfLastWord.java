package QuestionsSolving;

//Input: s = "Hello World"
//Output: 5
//Explanation: The last word is "World" with length 5.
public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }

    static int lengthOfLastWord(String s) {
        int count = 0;
        if (s == null || s.length() == 0) return 0;
        if(s.length()==1){
            return 1;
        }
        int i = s.length()-1;
        while(s.charAt(i)==' '){  // if any white spaces at the end of the string
            i--;
        }
        while(s.charAt(i) != ' '){ // if alphabet present at the index of i
            count++;
            i--;
        }
        return count;
    }
}
