public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {1,4,7,9,23,56,89,134,678,1234,6789,12345,56789};
        int target = 3656;
        System.out.println(ceiling(arr,target));
    }
    static int ceiling(int[] arr,int target){
//        int ceil = 0;
        if(target > arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end - start)/2;
//            ceil = mid;
            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else {
//                break;
                return arr[mid];
            }

        }
        return arr[start];
//        if(target>arr[ceil]){
//            return arr[ceil+1];
//        } else if (target<arr[ceil]) {
//            return arr[ceil-1];
//        } else {
//            return arr[ceil];
//        }
    }
}
