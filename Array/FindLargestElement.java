package Array;

public class FindLargestElement {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 89, 398};
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}
