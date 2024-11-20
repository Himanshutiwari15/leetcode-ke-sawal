package Array;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
    static public int majorityElement(int[] nums) {
        int ele = 0;
        int cnt = 0;
        for (int num : nums) {
            if (cnt == 0) {
                ele = num;
                cnt = 1;
            } else if (ele == num) {
                cnt++;
            } else {
                cnt--;
            }
        }
        return ele;
    }
}
