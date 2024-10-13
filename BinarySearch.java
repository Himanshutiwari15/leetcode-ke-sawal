public class BinarySearch {
    public static void main(String[] args) {
//        int[] arr = {0,3,6,9,22,66,87,223,878};
        int[] arr = {234,98,65,34,12,9,5,3,1,0};
        int target = 9;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        int i =0;
        while (start<=end){
            int mid = start + (end-start)/2;

            if(target>arr[mid]){
//                start = mid + 1;
                end = mid -1;
            }
            else if (target<arr[mid]){
//                end = mid -1;
                start = mid + 1;
            }
            else{
                return mid;
            }
            ++i;
        }
        return -1;
    }
}
