package QuestionsSolving.BitManipulation;

//Define an array nums where nums[i] = start + 2 * i (0-indexed) and n == nums.length.

//Input: n = 5, start = 0
//Output: 8
//Explanation: Array nums is equal to [0, 2, 4, 6, 8] where (0 ^ 2 ^ 4 ^ 6 ^ 8) = 8.
//Where "^" corresponds to bitwise XOR operator.
public class XOROperationArray {
    public static void main(String[] args) {
        System.out.println(xorOperation(5,0));

    }

     static  int xorOperation(int n, int start) {
          int ans=0;
          for(int i=0;i<n;i++){
              ans = ans ^ start+2*i;
          }
          return ans;

          
//         int res = start;
//         for (int i=1; i<n; i++){
//             res = res ^ (start + 2 * i);
//         }
//        return res;
    }
}
