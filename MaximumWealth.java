public class MaximumWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {1,5},{7,3},{3,5}
        };

        System.out.println(maximumWealth(arr));

    }
    static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for(int person = 0; person < accounts.length; ++person){
            int sum =0;
            for (int bank =0; bank < accounts[person].length; ++bank){
                sum = sum + accounts[person][bank];
            }
            if (sum > max){
                max = sum;
            }
        }
        return max;
    }
}
