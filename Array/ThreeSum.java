package Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
    static public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if(i != 0 && nums[i] == nums[i-1])continue;

            int j = i+1;
            int k = n-1;

            while (j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum<0){
                    ++j;
                } else if (sum > 0) {
                    --k;
                }else {
                    List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k]);
                    result.add(temp);
                    ++j;
                    --k;

                    while (j<k && nums[j] == nums[j-1])++j;
                    while (j<k && nums[k] == nums[k-1])--k;
                }
            }
        }
        return result;
    }
}
