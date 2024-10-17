import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int [] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
    static int[] twoSum(int[] nums, int target) {
        int[] sum = new int[2];
        int flag = 0;
        for (int i =0; i < nums.length;++i){
            for (int j = i+1; j < nums.length;++j){
                sum[0] = i;
                if(nums[j] + nums[sum[0]]==target){
                    sum[1] = j;
                    flag = 1;
                    break;
                }
            }
            if(flag == 1){
                break;
            }
        }
        return sum;
    }
}
