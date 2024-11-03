import java.util.Arrays;

public class TwoSumTwo {
    public static void main(String[] args) {
        int[] numbers = {0,0,3,5};
        int target = 0;
        System.out.println(Arrays.toString(twoSum(numbers,target)));
    }
    static int[] twoSum(int[] numbers, int target) {
//        int[] arr = new int[2];
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = i+1; j < numbers.length; j++) {
//                if(numbers[i] + numbers[j] == target){
//                    arr[0] = i+1;
//                    arr[1] = j+1;
//                    return arr;
//                }
//            }
//        }
//        return arr;

//        int[] arr = new int[2];
        int left = 0;
        int right = numbers.length-1;
        while (left<right){
            if(numbers[left] + numbers[right] == target){
//                arr[0] = left+1;
//                arr[1] = right+1;
                return new int[] {left+1,right+1};
            } else if (numbers[left] + numbers[right] > target) {
                right -= 1;
            }else {
                left += 1;
            }
        }
        return new int[] {-1,-1};
    }
}
