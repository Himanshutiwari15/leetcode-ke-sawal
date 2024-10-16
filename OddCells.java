import java.util.Arrays;
class OddCells {
    public static void main(String[] args) {
            int m = 2;
            int n = 3;
            int[][] indices = {
                    {0,1},
                    {1,1}
            };

            System.out.println(oddCells(m,n,indices));

    }

    static int oddCells(int m, int n, int[][] indices) {
            int[] rowCounts = new int[m];
            int[] colCounts = new int[n];

            // Update rowCounts and colCounts based on indices
            for (int[] index : indices) {
                rowCounts[index[0]]++;
                colCounts[index[1]]++;
            }

            int oddCount = 0;

            // Calculate the number of cells with odd values
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if ((rowCounts[i] + colCounts[j]) % 2 == 1) {
                        oddCount++;
                    }
                }
            }

            return oddCount;
    }


}