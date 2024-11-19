package Array;

public class CheckArraySorted {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 89, 398};
        boolean flag = false;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[i-1]){
                flag = true;
            }
            else {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}
