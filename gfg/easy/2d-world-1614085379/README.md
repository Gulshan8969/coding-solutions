# Matrix Traversal

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a square matrix  **mat[][]**, print all its elements in row-major order, where each row is printed in a new line and the elements in a row are printed from left to right.

 **Examples:** 

```
Input: mat[][] = [[1 2 3], [4 5 6], [7 8 9]]
Output: 
1 2 3
4 5 6
7 8 9
Explanation: The elements of the matrix are printed row by row, from left to right.

```

```
Input: mat[][] = [[5]]
Output: 5
Explanation: The matrix contains only one element, which is printed.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-29T15:58:34.384Z  

```java
class Solution {
    public void twoDimensional(ArrayList<ArrayList<Integer>> mat) {
        StringBuilder sb = new StringBuilder();
        for (ArrayList<Integer> row : mat) {
            for (int j = 0; j < row.size(); j++) {
                if (j > 0) sb.append(' ');
                sb.append(row.get(j));
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/2d-world-1614085379/1)