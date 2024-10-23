import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }
    static void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] == 0 && nums[i+1] != 0){
                nums[i] = nums[i+1];
                nums[i+1] = 0;
            }
            if(nums[i]==0 && nums[i+1]==0){
                nums[i] = nums[i+2];
                nums[i+2] = 0;
            }

        }
        System.out.println(Arrays.toString(nums));
    }
}
