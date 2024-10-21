public class FindDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,300,300,2,22};
        System.out.println(findDuplicatetwo(nums));
    }
    static int findDuplicate(int[] nums) {
        for (int i = 0; i< nums.length;++i) {
            for (int j = i+1; j < nums.length; ++j) {
                if (nums[i] == nums[j]) {
                    return nums[j];
                }
            }
        }
        return -1;
    }
//    class Solution {
    static public int findDuplicatetwo(int[] nums) {
            // Set<Integer> data=new HashSet<>();
            // for(Integer e:nums){
            //     boolean c=data.add(e);
            //     if(c==false){
            //         return e;
            //     }
            // }
            // return -1;
            boolean[] arr=new boolean[nums.length];
            for(int n:nums){
                if(arr[n]){
                    return n;
                }
                arr[n]=true;
            }
            return 404;
        }
//    }
}

