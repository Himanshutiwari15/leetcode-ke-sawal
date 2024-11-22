package Array;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(mat));
    }
    static public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> elements = new ArrayList<>();
        if(matrix==null || matrix.length==0){
            return elements;
        }
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;

        while (top<=bottom && left<=right){
            for (int i = left;i <= right;++i){
                elements.add(matrix[top][i]);
            }
            ++top;

            for (int i = top; i <= bottom;++i){
                elements.add(matrix[i][right]);
            }
            --right;

            if(top<= bottom){
                for (int i = right;i>= left;--i){
                    elements.add(matrix[bottom][i]);
                }
                --bottom;
            }

            if(left<= right){
                for (int i = bottom; i >= top;--i){
                    elements.add(matrix[i][left]);
                }
                ++left;
            }
        }

        return elements;
    }
}
