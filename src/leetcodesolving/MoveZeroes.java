package QuestionsSolving;

import java.util.Arrays;

//Input: nums = [0,1,0,3,12]
//Output: [1,3,12,0,0]
public class MoveZeroes {
    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};

        //using extra space
//       int[] additional=new int [nums.length];
//       int k=0;
//
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i]!= 0){
//               additional[k] = nums[i];
//               k++;
//        }
//        }
//       System.out.println(Arrays.toString(additional));

        
        int index=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] !=0){
                nums[index]= nums[i];
                index++;
            }
        }
        for (int i = index; i <nums.length ; i++) {
            nums[i]=0;
        }
        System.out.println(Arrays.toString(nums));
    }
}
