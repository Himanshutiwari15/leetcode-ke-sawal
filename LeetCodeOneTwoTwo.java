public class LeetCodeOneTwoTwo {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    static int maxProfit(int[] prices) {
        int totalprofit = 0;
        for (int i = 0; i < prices.length-1; i++) {
            if(prices[i] < prices[i+1]){
                totalprofit += prices[i+1] - prices[i];
            }
        }
        return totalprofit;
    }
}
