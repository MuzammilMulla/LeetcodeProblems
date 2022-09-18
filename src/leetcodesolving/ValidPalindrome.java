package QuestionsSolving;
//Input: s = "A man, a plan, a canal: Panama"
//Output: true
//Explanation: "amanaplanacanalpanama" is a palindrome.


public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
            //String s = "race a car";
            //String  s = " ";
        System.out.println(isPalindrome(s));

    }
    static boolean isPalindrome(String s) {
        s= s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        int i=0, j=s.length()-1;
        while ( i<s.length()){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
    return true;
    }
}
