package QuestionsSolving;

import java.util.HashSet;
//Input: nums = [2,2,1]
//Output: 1

//Input: nums = [4,1,2,1,2]
//Output: 4
public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {2,2,1};
        System.out.println(singleNumber(nums));
    }

    static int singleNumber(int[] nums) {

        HashSet< Integer> hashset = new HashSet<>();

        for(int i : nums){
            if(hashset.contains(i) ){
                hashset.remove(i);
            }
            else{
                hashset.add(i);
            }
        }
        for(int i : hashset){
            return i;
        }
       return -1;
    }
}
