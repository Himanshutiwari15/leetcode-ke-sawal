import java.util.Arrays;

public class GetConcatination {
    public static void main(String[] args) {

        int[] nums = {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));

    }
    static int[] getConcatenation(int[] nums) {
        int[] nums2x = new int[(2*nums.length)];
        for(int i =0; i < nums.length;++i){
            nums2x[i] = nums[i];
            nums2x[i + (nums.length)] = nums[i];
        }
        return nums2x;
    }
}
