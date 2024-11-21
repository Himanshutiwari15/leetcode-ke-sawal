package Array;

import java.util.ArrayList;

public class LeadersInTheArray {
    public static void main(String[] args) {
        int[] arr = {10,22,12,3,0,6};
        ArrayList<Integer> nums = new ArrayList<>();

        int maxTillNow = arr[arr.length-1];
        nums.add(arr[arr.length-1]);

        for (int i = arr.length-2; i >= 0 ; i--) {
            if(arr[i] > maxTillNow){
                maxTillNow = arr[i];
                nums.add(arr[i]);
            }
        }
        System.out.println(nums);
    }
}
