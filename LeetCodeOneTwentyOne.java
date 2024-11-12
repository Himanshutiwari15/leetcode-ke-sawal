public class LeetCodeOneTwentyOne {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    static int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxProfit = 0;
        if (prices.length == 1) {
            return 0;
        }
        for (int price : prices) {
            if (price < minprice) {
                minprice = price;
            }
            int currentprofit = price - minprice;
            if (currentprofit > maxProfit) {
                maxProfit = currentprofit;
            }
        }
        return maxProfit;
    }
}
