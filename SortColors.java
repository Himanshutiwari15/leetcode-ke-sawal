import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int [] nums = {2,0,2,1,1,0};
//        int [] nums = {2,0,1};
//        int [] nums = {};
//        int [] nums = {2,2,2};
        sortColors(nums);


    }
    static void sortColors(int[] nums) {
//        Method 1
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                if(nums[i]>nums[j]){
//                    int temp = nums[i];
//                    nums[i] = nums[j];
//                    nums[j] = temp;
//                }
//            }
//        }

//        Method 2
//        Dutch National Flag Algorithm
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                // Swap the current mid element with low and increment both low and mid
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                // Just move mid to the next position as 1 is in the middle
                mid++;
            } else if (nums[mid] == 2) {
                // Swap the current mid element with high and decrement high
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}