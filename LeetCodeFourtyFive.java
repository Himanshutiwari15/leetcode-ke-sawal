public class LeetCodeFourtyFive {
    public static void main(String[] args) {
        int[]nums = {2,3,1,1,4};
        System.out.println(jump(nums));
    }
    static int jump(int[] nums) {
        int jumps = 0;
        int currentEnd = 0;  // End of the current jump range
        int farthest = 0;    // Farthest point reachable from the current position

        for (int i = 0; i < nums.length - 1; i++) {
            // Update the farthest point we can reach from index i
            farthest = Math.max(farthest, i + nums[i]);

            // If we reach the end of the current jump range
            if (i == currentEnd) {
                jumps++;  // Increment the jump count
                currentEnd = farthest;  // Update the range for the next jump

                // If the currentEnd has reached or exceeded the last index, break
                if (currentEnd >= nums.length - 1) {
                    break;
                }
            }
        }

        return jumps;
    }
}
