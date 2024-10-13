public class FindNumbers {
    public static void main(String[] args) {
        int[] nums = {555,901,482,1771};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums) {
        int counter = 0;
        for(int i = 0; i < nums.length; ++i){
            int count = 0;
            while(nums[i] != 0){
                nums[i] = nums[i]/10;
                count ++;
            }
            if(count % 2 == 0){
                counter++;
            }
        }
        return counter;
    }
}
