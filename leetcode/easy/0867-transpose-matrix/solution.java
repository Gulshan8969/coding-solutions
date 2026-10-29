// class Solution {
//     public int[][] transpose(int[][] matrix) {
//        int row=matrix.length;
//        int col=matrix[0].length;
//        int arr[][]=new int [col][row];
//        for(int i=0;i<col;i++)
//        {
//         for(int j=0;j<row;j++)
//         {
//             arr[i][j]=matrix[j][i];
//         }
//        } 
//        return arr;
//     }
// }
class Solution {
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[][] t = new int[n][m];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                t[j][i] = matrix[i][j];
        return t;
    }
}