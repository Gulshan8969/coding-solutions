class Solution {
    void booleanMatrix(int mat[][]) {
        int rows = mat.length, cols = mat[0].length;
        boolean[] rowHasOne = new boolean[rows];
        boolean[] colHasOne = new boolean[cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                if (mat[i][j] == 1) {
                    rowHasOne[i] = true;
                    colHasOne[j] = true;
                }

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                if (rowHasOne[i] || colHasOne[j])
                    mat[i][j] = 1;
    }
}