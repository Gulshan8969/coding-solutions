class Solution {
    public int countSurroundedOnes(int[][] matrix) {
        int n = matrix.length;
        if (n == 0) return 0;
        int m = matrix[0].length;

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] != 1) continue;

                int zeros = 0;
                for (int di = -1; di <= 1; di++) {
                    for (int dj = -1; dj <= 1; dj++) {
                        if (di == 0 && dj == 0) continue;
                        int ni = i + di, nj = j + dj;
                        if (ni >= 0 && ni < n && nj >= 0 && nj < m && matrix[ni][nj] == 0) {
                            zeros++;
                        }
                    }
                }

                if (zeros > 0 && zeros % 2 == 0) count++;
            }
        }
        return count;
    }
}