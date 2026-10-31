# Lucky Numbers in a Matrix

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an `m x n` matrix of  **distinct** numbers, return  *all  **lucky numbers**  in the matrix in  **any** order*.

A  **lucky number**  is an element of the matrix such that it is the minimum element in its row and maximum in its column.

 

 **Example 1:** 

```
Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
Output: [15]
Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column.

```

 **Example 2:** 

```
Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
Output: [12]
Explanation: 12 is the only lucky number since it is the minimum in its row and the maximum in its column.

```

 **Example 3:** 

```
Input: matrix = [[7,8],[1,2]]
Output: [7]
Explanation: 7 is the only lucky number since it is the minimum in its row and the maximum in its column.

```

 

 **Constraints:** 

- m == mat.length
- n == mat[i].length
- 1 <= n, m <= 50
- 1 <= matrix[i][j] <= 105.
- All elements in the matrix are distinct.

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 25.29%)  
**Memory:** 46.8 MB (beats 79.29%)  
**Submitted:** 2026-10-31T02:18:42.474Z  

```java
class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int r = matrix.length, c = matrix[0].length;
        int[] rowMin = new int[r];
        int[] colMax = new int[c];
        Arrays.fill(rowMin, Integer.MAX_VALUE);

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) {
                rowMin[i] = Math.min(rowMin[i], matrix[i][j]);
                colMax[j] = Math.max(colMax[j], matrix[i][j]);
            }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                if (matrix[i][j] == rowMin[i] && matrix[i][j] == colMax[j])
                    result.add(matrix[i][j]);
        return result;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/lucky-numbers-in-a-matrix/)