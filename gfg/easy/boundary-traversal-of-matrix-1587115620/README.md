# Matrix Boundary Traversal

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a matrix  **mat[][]**. Return the boundary traversal on the matrix in a clockwise manner starting from the first row of the matrix.

 **Examples:** 

```
Input: mat[][] = [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12], [13, 14, 15,16]]
Output: [1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5]
Explanation: The boundary traversal is: [1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5]

```

```
Input:mat[][] = [[12, 11, 10, 9], [8, 7, 6, 5], [4, 3, 2, 1]]
Output: [12, 11, 10, 9, 5, 1, 2, 3, 4, 8]
Explanation: The boundary traversal is: [12, 11, 10, 9, 5, 1, 2, 3, 4, 8]
```

```
Input:mat[][] = [[12, 11], [4, 3]] 
Output: [12, 11, 3, 4]
Explanation: The boundary traversal is: [12, 11, 3, 4]

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-30T01:03:32.830Z  

```java
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
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/boundary-traversal-of-matrix-1587115620/1)