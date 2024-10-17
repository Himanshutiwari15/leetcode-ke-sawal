public class InfiniteArray {
    public static void main(String[] args) {
        int [] arr = {1,3,6,21,32,43,54,76,87,89,233,4343,5653455,2131423424};
        int target = 233;
        System.out.println(infintearray(arr,target));
    }
    static int infintearray(int [] arr, int target){
//        int position = 0;
        int start = 0;
        int end = 1;
        while (target > arr[end]){
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return BSearch(arr,target,start,end);
    }

    static int BSearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
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
