package QuestionsSolving.HashQuestions;

import java.util.Arrays;
import java.util.HashSet;

//Input: nums1 = [1,2,2,1], nums2 = [2,2]
//Output: [2]
public class IntersectionOfTwoArrays {
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }


    static int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer> set1= new HashSet<>();
        HashSet <Integer> set2= new HashSet<>();

        for(Integer i : nums1){
            set1.add(i);
        }

        for(Integer i : nums2){
            if(set1.contains(i)){
                set2.add(i);
            }
        }

        int [] arr = new int[set2.size()];
        int index=0;
        for(Integer i : set2){
            arr[index]= i;
            index++;
        }
        return arr;
    }
}