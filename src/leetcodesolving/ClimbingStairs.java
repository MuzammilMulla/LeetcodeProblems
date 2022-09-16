package QuestionsSolving;
//Input: n = 3
//Output: 3
//Explanation: There are three ways to climb to the top.
//1. 1 step + 1 step + 1 step
//2. 1 step + 2 steps
//3. 2 steps + 1 step
public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }

    static int climbStairs(int n) {
        int [] ans = new int[n +1];
        ans[0] = 1;
        ans[1] = 1;
        for(int  i=2; i<=n; i++){
            ans[i]= ans[i-1] + ans[i-2];
        }
        return ans[n];
    }
}
