# Transpose Matrix

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a 2D integer array `matrix`, return  *the  **transpose**  of*  `matrix`.

The  **transpose**  of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

 

 **Example 1:** 

```
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]

```

 **Example 2:** 

```
Input: matrix = [[1,2,3],[4,5,6]]
Output: [[1,4],[2,5],[3,6]]

```

 

 **Constraints:** 

- m == matrix.length
- n == matrix[i].length
- 1 <= m, n <= 1000
- 1 <= m * n <= 105
- -109 <= matrix[i][j] <= 109

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 28.49%)  
**Memory:** 46.1 MB (beats 96.89%)  
**Submitted:** 2026-10-29T16:00:50.329Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/transpose-matrix/)