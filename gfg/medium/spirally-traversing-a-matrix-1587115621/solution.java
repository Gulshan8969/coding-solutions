class Solution {
    public ArrayList<Integer> spirallyTraverse(int[][] mat) {
        ArrayList<Integer> res = new ArrayList<>();
        int top = 0, bottom = mat.length - 1;
        int left = 0, right = mat[0].length - 1;

        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++) res.add(mat[top][j]);
            for (int i = top + 1; i <= bottom; i++) res.add(mat[i][right]);
            if (top < bottom)
                for (int j = right - 1; j >= left; j--) res.add(mat[bottom][j]);
            if (left < right)
                for (int i = bottom - 1; i > top; i--) res.add(mat[i][left]);
            top++; bottom--; left++; right--;
        }
        return res;
    }
}