package QuestionsSolving.HashQuestions;

import java.util.HashSet;

/*
    Input: nums = [1,1,2,3,3,4,4,8,8]
    Output: 2
 */
public class SingleElementInSortedArray {
    public static void main(String[] args) {
        int [] nums = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(nums));
    }



     static int singleNonDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        if(hashSet.size()/2!=0){
            return 0;
        }
        for(Integer element : nums){
            if(hashSet.contains(element)){
                hashSet.remove(element);
            }else{
                hashSet.add(element);
            }
        }
         for(int i : hashSet){
            return i;
        }
       return -1;
    }
}