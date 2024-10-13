import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
    static int[] runningSum(int[] nums) {
        int[] rsum = new int[nums.length];
        rsum[0] = nums[0];
        for(int i=1; i< nums.length;++i){
            rsum[i] = rsum[i-1] + nums[i];
        }
        return rsum;
    }
}
