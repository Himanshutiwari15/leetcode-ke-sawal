package Array;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }
    static public int missingNumber(int[] nums) {
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i] != i){
//                return i;
//            }
//        }
//        return nums.length;

        int n = nums.length;
        int sum = n*(n+1)/2;
        int i = 0;
        while (i< n){
            sum -= nums[i];
            ++i;
        }
        return sum;
    }
}
