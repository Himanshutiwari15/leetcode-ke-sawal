public class MajorityElement {
    public static void main(String[] args) {
        int [] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
    static int majorityElement(int[] nums) {
        int element = 0;
        int count = 0;
        for (int num : nums) {
            if (count == 0) {
                element = num;
                count = 1;
            } else if (num == element) {
                count++;
            } else {
                count--;
            }
        }
        return element;
    }
}
