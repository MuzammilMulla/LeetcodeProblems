package QuestionsSolving;

//Input: num = 38
//Output: 2
//Explanation: The process is
//38 --> 3 + 8 --> 11
//11 --> 1 + 1 --> 2
//Since 2 has only one digit, return it.'
public class AddDigits {
    public static void main(String[] args) {
        int num=38;
        System.out.println(addDigits(num));

    }

    static int addDigits(int num) {
     int sum=0;
     while (num >0){
         sum+=num%10;
         num=num/10;

         if(num==0 && sum >9){
             num=sum;
             sum=0;
         }
     }
        return sum;

    }
}
