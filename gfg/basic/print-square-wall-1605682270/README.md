# Print Solid Square

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an integer  **n**, print a solid square pattern of size n × n using   **'*'** character **.** 

 **Examples:** 

```
Input: n = 5
Output:
 **   **  *
 **   **  *
 **   **  *
 **   **  *
 **   **  *
Explanation: A solid square of size 5 × 5.
```

```
Input:  n = 4
Output:
 **   **  
 **   **  
 **   **  
 **   **  
Explanation: A solid square of size 4 × 4.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-29T02:02:04.802Z  

```java
class Solution {
    public void printSolidSquare(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/print-square-wall-1605682270/1)