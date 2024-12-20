package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        int[] nums ={1,0,-1,0,-2,2};
        int target = 0;
        System.out.println(fourSum(nums,target));
    }
    static public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            if(i != 0 && nums[i] == nums[i-1])continue;

            for (int j = i+1; j < n; j++) {
                if(j != 0 && nums[j] == nums[j-1])continue;

                int k = j+1;
                int l = n-1;

                while (k<l){
                    long sum = nums[i] +nums[j] +nums[k] +nums[l];
                    if (sum==target){
                        List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                        result.add(temp);
                        ++k;
                        --l;

                        while (k<l && nums[k] == nums[k-1])++k;
                        while (k<l && nums[l] == nums[l+1])--l;
                    } else if (sum<target) {
                        ++k;
                    }else {
                        l--;
                    }
                }
            }
        }
        return result;
    }
}
