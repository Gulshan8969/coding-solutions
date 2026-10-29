import java.util.*;

class Solution {
    public List<Integer> exitPoint(int[][] mat) {
        int[] di = {0, 1, 0, -1}, dj = {1, 0, -1, 0};
        int i = 0, j = 0, d = 0;
        while (true) {
            if (mat[i][j] == 1) { mat[i][j] = 0; d = (d + 1) % 4; }
            int ni = i + di[d], nj = j + dj[d];
            if (ni < 0 || nj < 0 || ni >= mat.length || nj >= mat[0].length)
                return Arrays.asList(i, j);
            i = ni; j = nj;
        }
    }
}