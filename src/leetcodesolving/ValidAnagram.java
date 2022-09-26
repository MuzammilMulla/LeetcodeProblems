package QuestionsSolving.HashQuestions;
//Input: s = "anagram", t = "nagaram"
//Output: true

//Input: s = "rat", t = "car"
//Output: false

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
    String s = "cat", t = "rat";
        System.out.println(isAnagram(s,t));
    }

    static boolean isAnagram(String s, String t) {

        HashMap<Character,Integer> map=new HashMap<>();
        
        if(s.length()!=t.length()) return false;

        for(char c:s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }
        for(char c:t.toCharArray()){

            if(map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
                if (map.get(c) == 0) map.remove(c);
            }
        }
        return map.isEmpty();
    }
}
