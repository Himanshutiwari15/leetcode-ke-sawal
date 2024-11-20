package Array;

import java.util.ArrayList;

public class UnionTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,1,2,3,4,5};
        int[] arr2 = {2,3,4,4,5,6};

        int m = arr1.length;
        int n = arr2.length;
        int i =0, j=0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while (i<m && j<n){
            if (arr.isEmpty() || arr1[i] < arr2[j]) {
                if (arr.isEmpty() || arr.getLast() != arr1[i]) {
                    arr.add(arr1[i]);
                }
                i++;
            } else if (arr1[i] > arr2[j]) {
                if (arr.getLast() != arr2[j]) {
                    arr.add(arr2[j]);
                }
                j++;
            } else { // arr1[i] == arr2[j]
                if (arr.getLast() != arr1[i]) {
                    arr.add(arr1[i]);
                }
                i++;
                j++;
            }
        }

        // Add remaining elements from arr1
        while (i < m) {
            if (arr.isEmpty() || arr.getLast() != arr1[i]) {
                arr.add(arr1[i]);
            }
            i++;
        }

        // Add remaining elements from arr2
        while (j < n) {
            if (arr.isEmpty() || arr.getLast() != arr2[j]) {
                arr.add(arr2[j]);
            }
            j++;
        }

        System.out.println(arr);
    }
}
