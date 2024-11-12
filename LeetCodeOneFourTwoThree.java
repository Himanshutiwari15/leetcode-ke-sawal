import static java.lang.Math.max;

public class LeetCodeOneFourTwoThree {
    public static void main(String[] args) {
        int[] cardPoints = {1,2,3,4,5,6,1};
        int k = 3;
        System.out.println(maxScore(cardPoints,k));
    }
    static int maxScore(int[] cardPoints, int k) {
        int leftsum = 0;
        int rightsum = 0;
        int maxsum = 0;
        for (int i = 0; i < k; i++) {
            leftsum += cardPoints[i];
        }
        maxsum = leftsum;
        int rightindex = cardPoints.length - 1;
        for (int i = k-1; i >=0 ; --i) {
            leftsum -= cardPoints[i];
            rightsum += cardPoints[rightindex];
            rightindex--;
            maxsum = max(maxsum,leftsum+rightsum);
        }
        return maxsum;
    }
}
