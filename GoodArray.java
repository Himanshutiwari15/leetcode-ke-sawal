public class GoodArray {
    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(isGoodArray(nums));  // Should print true
    }

    // GCD function using the Euclidean algorithm
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    static boolean isGoodArray(int[] nums) {
        if (nums.length == 0) {
            return false;
        }

        // Initialize sumGcd with the first element
        int sumGcd = nums[0];

        // Compute the GCD of the entire array
        for (int i = 1; i < nums.length; i++) {
            sumGcd = gcd(sumGcd, nums[i]);
            if (sumGcd == 1) {
                return true;  // If at any point GCD becomes 1, return true
            }
        }

        return sumGcd == 1;  // Return true if GCD of all elements is 1
    }
}
