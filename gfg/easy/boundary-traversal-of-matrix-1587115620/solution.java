import java.util.*;

class Solution {
    public ArrayList<Integer> boundaryTraversal(int mat[][]) {
        ArrayList<Integer> res = new ArrayList<>();
        int n = mat.length;
        int m = mat[0].length;

        // Single row: just the row
        if (n == 1) {
            for (int j = 0; j < m; j++) res.add(mat[0][j]);
            return res;
        }

        // Single column: just the column, top to bottom
        if (m == 1) {
            for (int i = 0; i < n; i++) res.add(mat[i][0]);
            return res;
        }

        // Top row: left to right
        for (int j = 0; j < m; j++) res.add(mat[0][j]);

        // Right column: top to bottom (skip the corner already added)
        for (int i = 1; i < n; i++) res.add(mat[i][m - 1]);

        // Bottom row: right to left (skip the corner already added)
        for (int j = m - 2; j >= 0; j--) res.add(mat[n - 1][j]);

        // Left column: bottom to top (skip both corners already added)
        for (int i = n - 2; i >= 1; i--) res.add(mat[i][0]);

        return res;
    }
}