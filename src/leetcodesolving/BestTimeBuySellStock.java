package QuestionsSolving;

//Input: prices = [7,1,5,3,6,4]
//Output: 5
//Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
public class BestTimeBuySellStock {
    public static void main(String[] args) {
       int [] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }
    static int maxProfit(int[] prices) {

        int maxProfit =0;
        int msf =prices[0];

        for (int i = 0; i <prices.length ; i++) {
            msf = Math.min(msf, prices[i]);
            int profit = prices[i] - msf;
            maxProfit = Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
}
