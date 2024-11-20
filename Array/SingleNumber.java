package Array;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {3,3,2,1,2,1,3};
        System.out.println(singleNumber(nums));
    }
    static public int singleNumber(int[] nums) {
        int xorr = 0;
        for (int num : nums) {
            xorr ^= num;
        }
        return xorr;
    }
}
