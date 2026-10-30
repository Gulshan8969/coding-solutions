import java.util.*;

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int val = matrix[i][j];
                boolean isRowMin = true;
                boolean isColMax = true;

                // is val the smallest in its row?
                for (int k = 0; k < c; k++) {
                    if (matrix[i][k] < val) {
                        isRowMin = false;
                        break;
                    }
                }

                // is val the largest in its column?
                for (int k = 0; k < r; k++) {
                    if (matrix[k][j] > val) {
                        isColMax = false;
                        break;
                    }
                }

                if (isRowMin && isColMax) {
                    result.add(val);
                }
            }
        }
        return result;
    }
}