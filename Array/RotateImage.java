package Array;

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(mat);
    }
    static public void rotate(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            reverseArray(matrix[i]);
        }

        System.out.println(Arrays.deepToString(matrix));
    }

    public static void reverseArray(int[] row) {
        int start = 0;
        int end = row.length - 1;
        while (start < end) {
            // Swap elements
            int temp = row[start];
            row[start] = row[end];
            row[end] = temp;
            start++;
            end--;
        }
    }
}
