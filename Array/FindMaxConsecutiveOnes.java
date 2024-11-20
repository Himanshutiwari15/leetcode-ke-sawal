package Array;

public class FindMaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
    static public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int count = 0;
        int maxcount = Integer.MIN_VALUE;
        int i =0;
        while (i<n){
            if(nums[i] == 1){
                count++;
            } else {
                count = 0;
            }
            if(maxcount < count){
                maxcount = count;
            }
            ++i;
        }
        return maxcount;
    }
}
