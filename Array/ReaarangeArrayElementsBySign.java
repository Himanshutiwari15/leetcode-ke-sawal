package Array;

import java.util.Arrays;

public class ReaarangeArrayElementsBySign {
    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }
    static public int[] rearrangeArray(int[] nums) {
        int negIndex = 1;
        int posIndex = 0;
        int[] arr = new int[nums.length];
        for (int num : nums) {
            if (num < 0) {
                arr[negIndex] = num;
                negIndex += 2;
            } else {
                arr[posIndex] = num;
                posIndex += 2;
            }
        }
        return arr;
    }
}
