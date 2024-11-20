package Array;

public class BestTimeToBuyAndSellStocks {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    static public int maxProfit(int[] prices) {
        int max = 0;
        int minprice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            minprice = Math.min(minprice,prices[i]);
            max = Math.max(max,prices[i] - minprice);
        }
        return max;
    }
}
