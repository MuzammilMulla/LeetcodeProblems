package QuestionsSolving.HashQuestions;

import java.util.HashSet;
//Input:
//Output: 3
public class JewelsAndStones {
    public static void main(String[] args) {
        String  jewels = "aA", stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels, stones));
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
