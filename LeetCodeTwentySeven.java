public class LeetCodeTwentySeven {
    public static void main(String[] args) {
        int [] nums ={0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement(nums,val));
    }
    static int removeElement(int[] nums, int val) {
        int slowpointer = 0;
        int fastpointer = 0;
        while (fastpointer < nums.length){
            if(nums[fastpointer] != val){
                nums[slowpointer] = nums[fastpointer];
                slowpointer++;
            }
            fastpointer++;
        }
        return slowpointer;
    }
}
