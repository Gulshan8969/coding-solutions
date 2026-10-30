// class Solution {
//     public int diagonalSum(int[][] mat) {
//         int n = mat.length;
//         int sum = 0;

//         int i = 0;
//         int j = 0;
//         while (i < n && j < n) {
//             sum += mat[i][j];
//             i++;
//             j++;
//         }

//         i = 0;
//         j = n - 1;
//         while (i < n && j >= 0) {
//             sum += mat[i][j];
//             i++;
//             j--;
//         }

//         // Center element is counted twice when n is odd
//         if (n % 2 == 1) {
//             sum -= mat[n / 2][n / 2];
//         }

//         return sum;
//     }
// }
class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += mat[i][i] + mat[i][n - 1 - i];
        }

        if (n % 2 == 1) {
            sum -= mat[n / 2][n / 2];
        }

        return sum;
    }
}