# Spiral Matrix II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a positive integer `n`, generate an `n x n` `matrix` filled with elements from `1` to `n2` in spiral order.

 

 **Example 1:** 

```
Input: n = 3
Output: [[1,2,3],[8,9,4],[7,6,5]]

```

 **Example 2:** 

```
Input: n = 1
Output: [[1]]

```

 

 **Constraints:** 

- 1 <= n <= 20

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 42 MB (beats 99.48%)  
**Submitted:** 2026-10-30T01:05:57.277Z  

```java
// class Solution {
//     public int[][] generateMatrix(int n) {
//         if (n == 0) {
//             return new int[0][0];
//         }
//         int[][] matrix = new int[n][n];
//         int left = 0, right = n - 1, top = 0, bottom = n - 1, num = 1;

//         while (left <= right && top <= bottom) {
//             // 1. top row: left -> right
//             for (int i = left; i <= right; i++) {
//                 matrix[top][i] = num++;
//             }
//             top++;

//             // 2. right column: top -> bottom
//             for (int i = top; i <= bottom; i++) {
//                 matrix[i][right] = num++;
//             }
//             right--;

//             // 3. bottom row: right -> left
//             if (top <= bottom) {
//                 for (int i = right; i >= left; i--) {
//                     matrix[bottom][i] = num++;
//                 }
//                 bottom--;
//             }

//             // 4. left column: bottom -> top
//             if (left <= right) {
//                 for (int i = bottom; i >= top; i--) {
//                     matrix[i][left] = num++;
//                 }
//                 left++;
//             }
//         }
//         return matrix;
//     }
// }
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int top = 0, bottom = n - 1, left = 0, right = n - 1, num = 1;

        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++) matrix[top][j] = num++;
            for (int i = top + 1; i <= bottom; i++) matrix[i][right] = num++;
            if (top < bottom)
                for (int j = right - 1; j >= left; j--) matrix[bottom][j] = num++;
            if (left < right)
                for (int i = bottom - 1; i > top; i--) matrix[i][left] = num++;
            top++; bottom--; left++; right--;
        }
        return matrix;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/spiral-matrix-ii/)