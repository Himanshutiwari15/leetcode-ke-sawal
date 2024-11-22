package Array;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(generate(n));
    }
    static public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            pascal.add(generaterows(i));
        }
        return pascal;
    }

    private static List<Integer> generaterows(int row) {
        List<Integer> rowElements = new ArrayList<>();
        long value = 1; // First element is always 1
        rowElements.add((int) value);

        for (int col = 1; col <= row; col++) { // Loop through all columns in the row
            value = value * (row - col + 1) / col; // Update value using nCr formula
            rowElements.add((int) value);
        }

        return rowElements;
    }
}
