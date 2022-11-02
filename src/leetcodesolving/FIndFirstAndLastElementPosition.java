package QuestionsSolving;

import java.util.Arrays;
/*
    nums=[5,7,7,8,8,10];
    target= 8;
    output=[3,4]
 */
public class FIndFirstAndLastElementPosition {
    public static void main(String[] args) {
        int[]  nums={8,5,7,7,8,8,10,8};
        int target=10;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }



    static int[] searchRange(int[] nums, int target) {

        //brute force way
        int[] result=new int[2];
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]== target){
                result[0]=i;
                break;
            }
        }
        for (int i = nums.length-1; i >=0 ; i--) {
            if(nums[i]== target){
                result[1]=i;
                break;
            }
        }
        return result;
    }
}
