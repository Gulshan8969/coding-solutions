class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int r = matrix.length, c = matrix[0].length;
        int[] rowMin = new int[r];
        int[] colMax = new int[c];
        Arrays.fill(rowMin, Integer.MAX_VALUE);

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) {
                rowMin[i] = Math.min(rowMin[i], matrix[i][j]);
                colMax[j] = Math.max(colMax[j], matrix[i][j]);
            }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                if (matrix[i][j] == rowMin[i] && matrix[i][j] == colMax[j])
                    result.add(matrix[i][j]);
        return result;
    }
}