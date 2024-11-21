package Array;


import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class NextPermutation {
    public static void main(String[] args) {
        int[] nums = {2,1,5,4,3,0,0};
        nextPermutation(nums);
    }
    static public void nextPermutation(int[] nums) {
        int index =  -1;
        int i =0;
        int n = nums.length;
        while (i<n-1){
            if(nums[i]<nums[i+1]){
                index = i;
                break;
            }
            ++i;
        }

        if(index == -1){
            reverse(nums,0,n-1);
            System.out.println(Arrays.toString(nums));
        }
        else {

            for (int j = n - 1; j > index; j--) {
                if (nums[j] > nums[index]) {
                    int temp = nums[index];
                    nums[index] = nums[j];
                    nums[j] = temp;
                    break;
                }
            }


            reverse(nums, index + 1, n - 1);
            System.out.println(Arrays.toString(nums));
        }
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            ++start;
            --end;
        }
    }
}
