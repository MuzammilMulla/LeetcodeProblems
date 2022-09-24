package QuestionsSolving.HashQuestions;
//Input: s = "abcd", t = "abcde"
//Output: "e"
//Explanation: 'e' is the letter that was added.

import java.util.HashSet;

public class FindDifference {
    public static void main(String[] args) {
        String s = "abcd", t = "abcde";
        System.out.println(findTheDifference(s,t));
    }

    static char findTheDifference(String s, String t) {


        //        String s = "abcd", t = "abcde";
        ////        int sum = 0;
        ////        int sum1 = 0;
        ////        for (int i = 0; i < s.length(); i++) {
        ////            int charValue = s.charAt(i) + 0;
        ////            sum += charValue;
        ////        }
        ////        for (int i = 0; i < t.length(); i++) {
        ////            int charValue = t.charAt(i) + 0;
        ////            sum1 += charValue;
        ////        }
        ////        int total = sum1 - sum;
        ////        char c = (char) total;
        ////        System.out.println(c);


        HashSet<Character> hashSet = new HashSet<>();

        for (Character character : s.toCharArray()) {
            hashSet.add(character);
        }
        for (Character character : t.toCharArray()) {
            if (hashSet.contains(character)) {
                hashSet.remove(character);
            } else {
                hashSet.add(character);
            }
        }
        char ans = 0;
        for (Character e : hashSet) {
            ans = e;
        }
        return ans;

    }
}

