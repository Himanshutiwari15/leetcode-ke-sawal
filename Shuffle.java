import java.util.Arrays;

public class Shuffle {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        System.out.println(Arrays.toString(shuffle(nums,n)));
    }
    static int[] shuffle(int[] nums, int n) {
        int[] shuf = new int[nums.length];
        for (int i=0,j=0,k=n; i< nums.length; i=i+2,++j,++k){
            shuf[i]=nums[j];
            shuf[i+1] = nums[k];
        }
        return  shuf;
    }
}
