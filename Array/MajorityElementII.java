package Array;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }
    static public List<Integer> majorityElement(int[] nums) {
        List<Integer> maj = new ArrayList<>();

        int cnt1=0,cnt2=0;
        int el1=Integer.MIN_VALUE,el2=Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if(cnt1==0 && el2 != nums[i]){
                cnt1 = 1;
                el1 = nums[i];
            } else if (cnt2==0 && el1 != nums[i]) {
                cnt2 = 1;
                el2 = nums[i];
            } else if (nums[i] == el1) {
                cnt1++;
            } else if (nums[i] == el2) {
                cnt2++;
            }else {
                cnt1--;
                cnt2--;
            }
        }

        cnt1=0;cnt2=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == el1) cnt1++;
            if (nums[i] == el2) cnt2++;
        }
        int mini = (int) (nums.length/3)+1;
        if(cnt1>=mini)maj.add(el1);
        if(cnt2>=mini)maj.add(el2);

        return maj;
    }
}
