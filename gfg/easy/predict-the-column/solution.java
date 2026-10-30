class Solution {
    public int maxZeros(int[][] arr) {
        int n = arr.length;
        if (n == 0) return -1;
        int m = arr[0].length;

        int[] count = new int[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) count[j]++;
            }
        }

        int best = -1, max = 0;
        for (int j = 0; j < m; j++) {
            if (count[j] > max) {   // strict > keeps the leftmost column on ties
                max = count[j];
                best = j;
            }
        }
        return best;
    }
}