import java.util.ArrayList;
import java.util.List;

public class LuckyNumbers {
    public static void main(String[] args) {
        int[][] matrix = {
                {3, 7, 8},
                {9, 11, 13},
                {15, 16, 17}
        };
        System.out.println(luckyNumbers(matrix));
    }

    static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        // Iterate through each row to find the minimum element in the row
        for (int i = 0; i < matrix.length; ++i) {
            int minInRow = Integer.MAX_VALUE;
            int colIndex = -1;

            // Find the minimum element in the current row and its column index
            for (int j = 0; j < matrix[i].length; ++j) {
                if (matrix[i][j] < minInRow) {
                    minInRow = matrix[i][j];
                    colIndex = j;
                }
            }

            // Check if this minimum element is the maximum in its column
            boolean isMaxInCol = true;
            for (int k = 0; k < matrix.length; ++k) {
                if (matrix[k][colIndex] > minInRow) {
                    isMaxInCol = false;
                    break;
                }
            }

            // If it is the max in its column, add it to the result
            if (isMaxInCol) {
                result.add(minInRow);
            }
        }

        return result;
    }
}
