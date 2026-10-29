# Inverted Right Angle Triangle Pattern

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer n, the task is to print an inverted right-angled triangle pattern using the   * character. The pattern contains n rows, with the first row containing n stars and each subsequent row containing one fewer star.

 **Examples:** 

```
Input: n = 5
Output:
  *
  
*** 
**
*
Explanation: Length of perpendicular and base of triangle is 5.
```

```
Input: n = 3
Output:
*** 
** 
*
Explanation: Length of perpendicular and base of triangle is 3.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-29T02:13:10.336Z  

```java
class Solution {
    public void rightPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/inverted-right-angletriangle-1605691171--104349/1)