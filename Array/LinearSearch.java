package Array;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {1,43,23,22,43,23,22,221,345};
        int find = 23;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == find){
                System.out.println(i);
                break;
            }
            System.out.println("not found on this index");
        }
    }
}
