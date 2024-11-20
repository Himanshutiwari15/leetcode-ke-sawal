package Array;

public class CheckArraySorted {

        public boolean check(int[] arr) {
            if (arr.length <= 1) {
                return true; // An empty array or a single-element array is considered sorted
            }

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] <= arr[i - 1]) {
                    return false; // If the current element is not greater than the previous one, return false
                }
            }
            return true; // If no issues were found, the array is strictly increasing
        }

}
