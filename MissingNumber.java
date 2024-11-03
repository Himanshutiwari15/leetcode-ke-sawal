public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {};
        System.out.println(missingNumber(nums));
    }
    static int missingNumber(int[] nums) {
        int n = nums.length;
        boolean[] arr = new boolean[n+1] ;
        for (int num : nums) {
            arr[num] = true;
        }
        for (int i = 0; i < arr.length; i++) {
            if(!arr[i]){
                return i;
            }
        }
        return -1;
    }
}
