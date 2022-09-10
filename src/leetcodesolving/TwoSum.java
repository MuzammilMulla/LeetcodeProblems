package QuestionsSolving;

import java.util.Arrays;

//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
public class TwoSum {
    public static void main(String[] args) {
        int [] nums = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(nums, 9)));
    }

    static int[] twoSum(int[] nums, int target) {
        if (nums.length == 0) {
            return null;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
