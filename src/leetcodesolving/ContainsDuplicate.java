package QuestionsSolving.HashQuestions;

import java.util.HashSet;

//Input: nums = [1,2,3,1]
//Output: true


public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));
    }

    static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (Integer e : nums) {
            if (hashSet.contains(e)) return true;
            else {
                hashSet.add(e);
            }
        }
        return false;
    }
}
