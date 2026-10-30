# Reverse Order of Rows in Matrix

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a matrix  **mat[][]**, reverse the order of its rows in-place. After the operation, the first row should become the last row, the second row should become the second last row, and so on.

 **Examples:** 

```
Input: mat[][] = [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12], [13, 14, 15, 16]]

Output: [[13, 14, 15, 16], [9, 10, 11, 12], [5, 6, 7, 8], [1, 2, 3, 4]]

Explanation: After reversing the order of the rows, the first row becomes the last row, the second row becomes the second last row, and so on.

```

```
Input: mat[][] = [[1, 2, 3], [4, 5, 6],[7, 8, 9], [10, 11, 12], [13, 14, 15]]

Output: [[13, 14, 15],[10, 11, 12], [7, 8, 9], [4, 5, 6], [1, 2, 3]]

Explanation: After reversing the order of the rows, the first row becomes the last row, the second row becomes the second last row, and so on.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-30T01:01:52.572Z  

```java
class Solution {
    void interchangeRows(int[][] mat) {
        int top = 0;
        int bottom = mat.length - 1;

        while (top < bottom) {
            int[] temp = mat[top];
            mat[top] = mat[bottom];
            mat[bottom] = temp;
            top++;
            bottom--;
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/reversing-the-rows-of-a-matrix-1587115621/1)