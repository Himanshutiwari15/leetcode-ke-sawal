public class NumIdenticalPairs {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1};
        System.out.println(numIdenticalPairs(nums));
    }
    static int numIdenticalPairs(int[] nums) {
        int pairs = 0;
        for (int i = 0; i < nums.length-1; i++) {
            for(int j = i+1; j<nums.length;++j){
                if(nums[i]==nums[j]){
                    pairs++;
                }
            }
        }
        return pairs;
    }
}
