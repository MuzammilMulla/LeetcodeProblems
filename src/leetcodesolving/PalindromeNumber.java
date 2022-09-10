package QuestionsSolving;
//Input: x = 121
//Output: true
//Explanation: 121 reads as 121 from left to right and from right to left.

//Input: x = -121
//Output: false
//Explanation: From left to right, it reads -121. From right to left, it becomes 121-.
// Therefore, it is not a palindrome.
public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }

    static boolean isPalindrome(int x) {
            int og = x;
            if(x<0){
                return false;
            }
            int reverse = 0;
            while (x != 0) {
                int remainder = x % 10;
                reverse = reverse * 10 + remainder;
                x = x / 10;
            }
            return og== reverse ;
        }
    }

