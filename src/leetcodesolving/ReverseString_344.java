package Strings;

/*
    Input: s = ["h","e","l","l","o"]
    Output: ["o","l","l","e","h"]


 */
public class ReverseString_344 {
    public static void main(String[] args) {

    }

        public void reverseString(char[] s) {
            int start=0;
            int end= s.length-1;

            while(start <=end){
                char temp = s[start];
                s[start]= s[end];
                s[end]= temp;


                start+=1;
                end-=1;

            }
        }
}
