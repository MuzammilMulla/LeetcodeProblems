package QuestionsSolving;

import java.util.Arrays;
import java.util.Stack;
//Input: nums = [2,2,1]
//Output: 1

//Input: nums = [4,1,2,1,2]
//Output: 4
public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }

    static int singleNumber(int[] nums) {

       // --> using STACK
        Arrays.sort(nums);
        Stack <Integer> stack = new Stack<>();
        for(int n: nums){
            if(!stack.isEmpty() && stack.peek() == n){
                stack.pop();
            }
            else{
                stack.push(n);
            }
        }
        for(int a : stack){
            return a;
        }
        return -1;

        //  using HASHSET

//        HashSet< Integer> hashset = new HashSet<>();
//
//        for(int i : nums){
//            if(hashset.contains(i) ){
//                hashset.remove(i);
//            }
//            else{
//                hashset.add(i);
//            }
//        }
//        for(int i : hashset){
//            return i;
//        }
//       return -1;
    }
}
