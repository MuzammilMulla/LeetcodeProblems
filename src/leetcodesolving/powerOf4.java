package leetcodesolving;

public class powerOf4 {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(8));
    }
    static boolean isPowerOfFour(int n)
    {
        if(n == 0)
            return false;
        while(n != 1)
        {
            if(n % 4 != 0)
                return false;
            n = n / 4;
        }
        return true;
    }
}
