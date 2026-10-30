# Count 1s Surrounded by Even  0s

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a binary matrix  **matrix[][]** containing only  **0** s and  **1** s, count cells containing  **1**  and have a positive even number of surrounding 0s.

- For each cell (except on boundary), there are 8 surrounding cells, directly above, below, left, right, and the four diagonal cells. 
- The cells on boundary have less surrounding cells as cells outside matrix are not considered.

 **Examples:** 

```
Input: matrix[][] = [[1, 0, 0], [1, 1, 0], [0, 1, 0]]
Output: 1
Explanation: The 1 at position (1, 0) has 2 surrounding 0s, which is a positive even number, so it is counted.
The other 1s have 1, 5, and 3 surrounding 0s respectively, all of which are odd. Hence, the total count is 1.
```

```
Input: matrix[][] = [[1]]
Output: 0
Explanation: The matrix contains only one cell, so it has no surrounding cells and therefore has 0 surrounding 0s. Since at least one surrounding 0 is required, this 1 is not counted.
```

```
Input: matrix[][] = [[0, 0, 0], [0, 1, 0], [0, 0, 0]]
Output: 1
Explanation: The 1 at position (1, 1) has 8 surrounding cells, and all 8 are 0s. Since 8 is a positive even number, this 1 is counted. Hence, the answer is 1.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-30T00:51:31.248Z  

```java
class Solution {
    public int countSurroundedOnes(int[][] matrix) {
        int n = matrix.length;
        if (n == 0) return 0;
        int m = matrix[0].length;

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] != 1) continue;

                int zeros = 0;
                for (int di = -1; di <= 1; di++) {
                    for (int dj = -1; dj <= 1; dj++) {
                        if (di == 0 && dj == 0) continue;
                        int ni = i + di, nj = j + dj;
                        if (ni >= 0 && ni < n && nj >= 0 && nj < m && matrix[ni][nj] == 0) {
                            zeros++;
                        }
                    }
                }

                if (zeros > 0 && zeros % 2 == 0) count++;
            }
        }
        return count;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/surround-the-1s2505/1)