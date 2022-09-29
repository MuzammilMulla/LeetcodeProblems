package QuestionsSolving;

import java.util.HashMap;


//Input: nums = [8,8,7,7,7]
//Output: 7
public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {8,8,7,7,7};
        System.out.println(majorityElement(nums));
    }

    static int majorityElement(int[] nums) {

        //using hashmap
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int number: nums){

            if(map.containsKey(number) && map.get(number) +1 > nums.length/2 ){
                return number;
            }
            else{
                map.put(number, map.getOrDefault(number,0)+1);
            }
        }
        return 1;


        //using brute-force
//        int maxCount= nums.length/2;
//        for(int num : nums){
//            int count =0;
//            for(int element : nums){
//
//                if(element==num){
//                    count+=1;
//                }
//
//            }
//            if(count>maxCount){
//                return num;
//            }
//        }
//        return -1;



//      using sorting technique
//        Arrays.sort(nums);
//        return nums[nums.length/2];
    }
}
