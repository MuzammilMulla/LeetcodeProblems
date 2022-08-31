public class SumOfArray {
    public static void main(String[] args) {
        int [] arr = { 1,2,4,5,6};
        //int [] arr = {100};
       // int [] arr = { };
        System.out.println(sum(arr, 0, 0));
    }
    static int sum(int[] arr, int sum,int i){
        // base condition
        if(arr.length <=0){
            return 0;
        }
        if(arr.length == 1){
            return arr[0];
        }if(i==arr.length){
            return sum;
        }
        return sum(arr,sum+arr[i], i+1);
    }
}
