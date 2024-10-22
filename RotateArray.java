import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(nums, k);
        System.out.println("Output: " + Arrays.toString(nums));
    }

    static void rotate(int[] nums, int k) {
        int[] rotated = new int[nums.length];
        k = k % nums.length; // In case k is greater than the length of the array

        for (int i = 0; i < nums.length; i++) {
            rotated[(i + k) % nums.length] = nums[i];
        }

        // Copy the rotated array back into the original array
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rotated[i];
        }
    }
}
