# Diamond Shape Pattern

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a number  **n**, print a diamond-shaped star pattern consisting of 2n rows, where the number of stars increases from 1 to n and then decreases from n to 1, forming a diamond.

 **Examples:** 

```
Input: n = 5
Output:

```

```
Input: n = 3
Output:

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-29T07:40:10.096Z  

```java
class Solution {
    public void printDiamond(int n) {
        // Upper half: 1 -> n stars
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("* ");
            System.out.println();
        }

        // Lower half: n -> 1 stars
        for (int i = n; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("* ");
            System.out.println();
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/pattern/1)