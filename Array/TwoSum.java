package Array;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int tar = 6;
        System.out.println(Arrays.toString(twoSum(nums, tar)));
    }
    static public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        Arrays.sort(nums);
        while (left<=right){
            if((nums[left] + nums[right]) > target){
                --right;
            } else if ((nums[left] + nums[right]) < target) {
                ++left;
            }else {
                return new int[]{left,right};
            }
        }
        return new int[]{left,right};
    }
}
