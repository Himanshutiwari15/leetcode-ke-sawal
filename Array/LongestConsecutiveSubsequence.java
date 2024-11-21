package Array;

import java.util.HashSet;

public class LongestConsecutiveSubsequence {
    public static void main(String[] args) {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(nums));
    }
    static public int longestConsecutive(int[] nums) {
        if(nums==null || nums.length==0){
            return 0;
        }

        HashSet<Integer> numSet = new HashSet<>();
        for(int num: nums){
            numSet.add(num);
        }

        int longestStreak = 0;

        for(int num:numSet){
            if(!numSet.contains(num-1)){
                int currentNum = num;
                int currentStreak = 1;

                while (numSet.contains(currentNum+1)){
                    currentNum +=1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(currentStreak,longestStreak);
            }
        }
        return longestStreak;
    }
}
