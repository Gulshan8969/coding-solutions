# Half Diamond Star Pattern

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an integer  **n**, print the Half Diamond Star Pattern using * characters as shown in the examples.

 **Examples:** 

```
Input: 5
Output:
* 
 **  
 **  * 
 **   **  
 **   **  *
 **   ** 
 **  *
 ** 
*
```

```
Input: 3
Output:
* 
 **  
 **  * 
 ** 
*
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-29T07:45:08.250Z  

```java
class Solution {
    public void printHalfStar(int n) {
        // upper half: 1 -> n stars
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // lower half: n-1 -> 1 stars
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/triangle-pattern-1661718013/1)