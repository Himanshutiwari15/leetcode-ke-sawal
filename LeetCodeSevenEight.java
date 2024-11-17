import java.util.ArrayList;
import java.util.List;

public class LeetCodeSevenEight {
    public static void main(String[] args) {

    }
    static public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(0, nums, new ArrayList<>(), result);
        return result;
    }

    private static void generateSubsets(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
        // Add the current subset to the result
        result.add(new ArrayList<>(current));

        // Explore further subsets
        for (int i = index; i < nums.length; i++) {
            // Include nums[i] in the current subset
            current.add(nums[i]);

            // Recur for the next elements
            generateSubsets(i + 1, nums, current, result);

            // Backtrack: remove nums[i] from the current subset
            current.remove(current.size() - 1);
        }
    }
}
