package QuestionsSolving.HashQuestions;


import java.util.HashMap;
import java.util.Map;

//Input: nums = [1,2,3,1,1,3]
//Output: 4
//Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 1, 1, 3};
        System.out.println(numIdenticalPairs(nums));
    }

    static int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int sum = 0;
        for (Integer val : map.values()) {
            sum += val * (val - 1) / 2;
        }
        return sum;
    }
}
        //using for loops
//        int count = 0;
//        for (int i = 0; i < nums.length ; i++) {
//            for (int j = 0; j < nums.length ; j++) {
//                if (nums[i] == nums[j] && i < j) {
//                    count++;
//                }
//            }
//        }
//        return count;
//    }
//}
