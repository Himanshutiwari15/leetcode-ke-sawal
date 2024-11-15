public class LeetCodeTwoThreeOne {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(isPowerOfTwo(n));
    }
    static boolean isPowerOfTwo(int n) {
        // Base cases
        if (n == 1) {
            return true;
        }
        if (n <= 0 || n % 2 != 0) {
            return false;
        }
        // Recursive call
        return isPowerOfTwo(n / 2);
    }

}
