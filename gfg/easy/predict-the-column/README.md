# Column with Max 0s

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a square matrix  **mat[][]**  consisting only of  **0** s and  **1** s. Find the index of the column that contains the maximum number of 0s.

If more than one column has the same maximum number of 0s, return the index of the leftmost such column.

If no column contains any 0 (i.e., all elements in the matrix are 1), return -1.

 **Examples:** 

```
Input: mat[][] = [[0, 0, 0], [1, 0, 1], [0, 1, 1]]
Output: 0
Explanation: Columns 0 and 1 contain the same number of 0s; however, column 0 appears first, so the answer is 0.
```

```
Input: mat[][] = [[1, 1, 1], [1, 1, 1], [1, 1, 1]]
Output: -1
Explanation: Since no column contains any 0s, the answer is -1.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-30T00:48:11.643Z  

```java
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
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/predict-the-column/1)