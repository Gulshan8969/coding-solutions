class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int top = 0, bottom = matrix.length - 1, left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++) list.add(matrix[top][j]);
            for (int i = top + 1; i <= bottom; i++) list.add(matrix[i][right]);
            if (top < bottom)
                for (int j = right - 1; j >= left; j--) list.add(matrix[bottom][j]);
            if (left < right)
                for (int i = bottom - 1; i > top; i--) list.add(matrix[i][left]);
            top++; bottom--; left++; right--;
        }
        return list;
    }
}
