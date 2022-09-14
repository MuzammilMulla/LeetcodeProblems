package QuestionsSolving;
//Input: digits = [1,2,3]
//Output: [1,2,4]
//Explanation: The array represents the integer 123.
//Incrementing by one gives 123 + 1 = 124.
//Thus, the result should be [1,2,4].


import java.util.Arrays;

//Input: digits = [9]
//Output: [1,0]
//Explanation: The array represents the integer 9.
//Incrementing by one gives 9 + 1 = 10.
//Thus, the result should be [1,0].
public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    static int[] plusOne(int[] digits) {
        if(digits.length==1 && digits[0] ==9){
            int[] arr = {1,0};
            return arr;
        }
        for (int i = digits.length-1; i >= 0 ; i--) {
            if(digits[i] <9){
                digits[i]++;
                return digits;
            }
            digits[i] =0;
        }
        int [] new_array = new int[digits.length+1];
        new_array[0] =1;
        return new_array;
    }
}