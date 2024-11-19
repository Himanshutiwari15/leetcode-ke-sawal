package Array;

import java.util.Arrays;

public class RemoveDuplicatesSortedArray {
    //in-place
    public static void main(String[] args) {
        int [] arr = {1,1,2,2,2,3,3,3,4,4,4};
        int left = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[left]){
                left++;
                arr[left] = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
