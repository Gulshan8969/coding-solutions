# Spiral Matrix

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an `m x n` `matrix`, return  *all elements of the*  `matrix`  *in spiral order*.

 

 **Example 1:** 

```
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]

```

 **Example 2:** 

```
Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]

```

 

 **Constraints:** 

- m == matrix.length
- n == matrix[i].length
- 1 <= m, n <= 10
- -100 <= matrix[i][j] <= 100

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 42.6 MB (beats 87.32%)  
**Submitted:** 2026-10-30T07:15:10.840Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/spiral-matrix/)