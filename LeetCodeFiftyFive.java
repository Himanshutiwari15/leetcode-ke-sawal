public class LeetCodeFiftyFive {
    public static void main(String[] args) {
        int[]nums = {3,2,1,0,4};
        System.out.println(canJump(nums));
    }
    static boolean canJump(int[] nums) {
        int farthest = 0;

        for (int i = 0; i < nums.length; i++) {
            // If i is beyond the farthest we can reach, return false
            if (i > farthest) {
                return false;
            }
            // Update the farthest point we can reach
            farthest = Math.max(farthest, i + nums[i]);

            // If the farthest reach is enough to get to the last index, return true
            if (farthest >= nums.length - 1) {
                return true;
            }
        }

        return false;
    }
}
