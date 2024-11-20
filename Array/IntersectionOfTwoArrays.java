package Array;

import java.util.ArrayList;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,1,2,3,4,5};
        int[] arr2 = {2,3,4,4,5,6};

        int m = arr1.length;
        int n = arr2.length;
        int i =0, j=0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while (i<m && j<n){
            if(arr1[i]<arr2[j]){
                ++i;
            } else if (arr1[i]> arr2[j]) {
                ++j;
            }else {
                arr.add(arr1[i]);
                ++i;
                ++j;
            }
        }
        System.out.println(arr);
    }
}
