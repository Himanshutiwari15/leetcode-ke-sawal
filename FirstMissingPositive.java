public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1};
        System.out.println(firstMissingPositive(nums));  // Output should be 2
    }

    static int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Rearrange the array by placing numbers in their correct positions
        for (int i = 0; i < n; i++) {
            // Keep swapping until the number is in the correct place or out of range
            while (nums[i] > 0 && nums[i] <= n && nums[i] != nums[nums[i] - 1]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }

        // Find the first missing positive integer
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        // If all numbers are in their correct place, return n + 1
        return n + 1;
    }
}
