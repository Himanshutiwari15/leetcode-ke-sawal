public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int [] arr = {0,1,2,1};
//        System.out.println(peakIndexInMountainArray(arr));
    }
//    static public int peakIndexInMountainArray(int[] arr) {
//        int max = Integer.MIN_VALUE;
//        max = arr[0];
//        int mid = BSearch(arr,max);
//        while(mid > max){
//
//        }
//
//
//    }

    static int BSearch(int[] arr, int target) {
        int start =0;
        int end = arr.length -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
}
