package QuestionsSolving.HashQuestions;

import java.util.HashSet;
//Input:
//Output: 3
public class JewelsAndStones {
    public static void main(String[] args) {
        String  jewels = "aA", stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels, stones));

//
//        String s = "myname";
//        char[] c =s.toCharArray();
//        for (int i = 0; i <c.length ; i++) {
//            System.out.print(c[i] + " ");  //m y n a m e
//        }
    }

    static int numJewelsInStones(String jewels, String stones) {

        HashSet <Character> hashSet = new HashSet<>();

        int count =0;

        for(Character c : jewels.toCharArray()){  //add every character to hashset from jewels
            hashSet.add(c);
        }

        for(Character c: stones.toCharArray()){ //for every character in stones
            if(hashSet.contains(c)){  //if the character already exists in hashset, increment count by 1
                count++;
            }
        }
      return count;
    }
}
//HashMap<Integer,Character> map = new HashMap<>() ;
//            for(int i=0; i<jewels.length(); i++)
//                    map.put(i, jewels.charAt(i) );
//            for(int i=0; i<stones.length(); i++)
//                   if( map.containsValue(stones.charAt(i)))
//                           count++;
//            return count;
