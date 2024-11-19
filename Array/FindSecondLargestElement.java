package Array;

public class FindSecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 89, 398};
        int largest = Integer.MIN_VALUE;
        int slargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest){
                slargest = largest;
                largest = arr[i];
            } else if (arr[i] > slargest) {
                slargest = arr[i];
            }
        }
        System.out.println(slargest);
    }
}
