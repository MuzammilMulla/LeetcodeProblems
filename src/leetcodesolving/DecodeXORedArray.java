package QuestionsSolving.BitManipulation;

import java.util.Arrays;

//Input: encoded = [1,2,3], first = 1
//Output: [1,0,2,1]
//Explanation: If arr = [1,0,2,1], then first = 1 and encoded = [1 XOR 0, 0 XOR 2, 2 XOR 1] = [1,2,3]
public class DecodeXORedArray {
    public static void main(String[] args) {
        int [] encoded = {1,2,3};
         int first = 1;

        System.out.println(Arrays.toString(decode(encoded,first)));

    }

    static int[] decode(int[] encoded, int first) {

        int [] code = new int[encoded.length+1];
        code[0] = first;

        for (int i = 0; i < encoded.length; i++) {
            code[i+1] = code[i] ^ encoded[i];
        }
        return code;
    }
}
