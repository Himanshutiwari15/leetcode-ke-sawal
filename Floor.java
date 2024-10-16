public class Floor {
    public static void main(String[] args) {
        int[] arr = {1,4,7,9,23,56,89,134,678,1234,6789,12345,56789};
        int target = 3656;
        System.out.println(floor(arr,target));
    }
    static int floor(int[] arr,int target){
//        int floor = 0;
        if(target < arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end - start)/2;
//            floor = mid;
            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else {
//                break;
                return arr[mid];
            }

        }
        return arr[end];
//        if(target>arr[floor]){
//            return arr[floor+1];
//        } else if (target<arr[floor]) {
//            return arr[floor-1];
//        } else {
//            return arr[floor];
//        }
    }
}
