import java.util.ArrayList;
import java.util.List;

public class CreateTargetArray {
    public static void main(String[] args) {
        // Example 1
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};

        int[] targetArray = createTargetArray(nums, index);

        // Print the target array
        System.out.print("Output: [");
        for (int i = 0; i < targetArray.length; i++) {
            System.out.print(targetArray[i]);
            if (i < targetArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        // Using an ArrayList for dynamic insertion
        List<Integer> targetList = new ArrayList<>();

        // Loop through each element in nums and index
        for (int i = 0; i < nums.length; i++) {
            targetList.add(index[i], nums[i]);
        }

        // Convert the ArrayList back to an array
        int[] targetArray = new int[targetList.size()];
        for (int i = 0; i < targetList.size(); i++) {
            targetArray[i] = targetList.get(i);
        }

        return targetArray;
    }
}
