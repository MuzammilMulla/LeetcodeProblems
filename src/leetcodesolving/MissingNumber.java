package QuestionsSolving;

//Output: 2
//Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3].
// 2 is the missing number in the range since it does not appear in nums.

//Input: nums = [9,6,4,2,3,5,7,0,1]
//Output: 8
//Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9].
// 8 is the missing number in the range since it does not appear in nums.
public class MissingNumber {
    public static void main(String[] args) {
        int [] nums = {9,6,4,2,3,5,7,0,1};
       //int [] nums = {0,1};
        //int[] nums ={3,0,1};
        System.out.println(missingNumber(nums));
    }

    static int missingNumber(int[] nums) {
        int expectedSum = 0, actualSum=0;
        int missingNumber =0;

        //for expectedSum
        for (int i = 0; i <=nums.length ; i++) {
            expectedSum = expectedSum+ i;
        }
        //for actualSum
        for (int i = 0; i <nums.length ; i++) {
            actualSum= actualSum+ nums[i];
        }
        missingNumber = expectedSum - actualSum;
        return missingNumber;
}
    }
