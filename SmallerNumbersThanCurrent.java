import java.util.Arrays;

public class SmallerNumbersThanCurrent {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] freq = new int[nums.length];
        int count=0;

        for (int i=0; i<nums.length;++i){
            count =0;
            for (int j=0; j< nums.length;++j){
                if((i != j) && (nums[j] < nums[i])) {
                    count++;
                }
            }
            freq[i] = count;
        }
        return freq;
    }
}
