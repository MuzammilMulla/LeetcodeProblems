package QuestionsSolving;

import java.util.Arrays;

//Input: nums = [1,2,3,4]
//Output: [1,3,6,10]
//Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
public class RunningSumOf1Darray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        //int[]nums = {};
        System.out.println(Arrays.toString(runningSum(nums)));
    }


//    --> first approach

//    static int[] runningSum(int[] nums)
//            int[] result = new int[nums.length];
//            if(nums.length<=0){
//                return nums;
//            }
//            result[0] =  nums[0];
//            for(int i =0; i< nums.length;i++){
//                if(i>0){
//                result[i] = result[i-1] + nums[i];
//                 }
//            }
//            return result;
//        }
//    }



//  --> second approach

    static int[] runningSum(int[] nums){
        if(nums.length == 0){
            return nums;
        }
        for (int i = 0; i <nums.length ; i++) {
            if(i>0){
                nums[i] += nums[i-1];
            }
        }
        return nums;
    }
}
