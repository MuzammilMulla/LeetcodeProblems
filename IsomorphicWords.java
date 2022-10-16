package QuestionsSolving;

import java.util.HashSet;

public class IsomorphicWords {
    public static void main(String[] args) {
        String s= "aaeaa";
        String t= "uuxyy";

        System.out.println(isIsomorphic(s,t));
    }


    static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashSet hashSet1 = new HashSet();
        HashSet hashSet2 = new HashSet();


        for (char c : s.toCharArray()) {
            if (!hashSet1.contains(c)) {
                hashSet1.add(c);
            } else {
                hashSet1.remove(c);
            }
        }
        int counths1 = hashSet1.size();



        for (char c : t.toCharArray()) {
            if (!hashSet2.contains(c)) {
                hashSet2.add(c);
            } else {
                hashSet2.remove(c);
            }
        }
        int counths2 = hashSet2.size();


        if (counths1 == counths2) {
            return true;
        } else {
            return false;
        }

    }
}
