//Input:
//N = 10
//Output: 1 2 3 4 5 6 7 8 9 10
public class Print1ToNwithoutLoop {
    public static void main(String[] args) {
        printN(10,1);
    }

    static void printN(int n,int i){
        if( i==n+1 ){
            return;
        }
        if(i<=10){
            System.out.print(i + " ");
            printN(n,i+1);
        }
    }
}
