# Next Power of Two

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a positive integer n, find the smallest power of 2 that is greater than or equal to n. If n is already a power of 2, return n.

 **Examples:** 

```
Input: n = 5
Output: 8
Explanation: The powers of 2 around 5 are 4 and 8. Since 8 is the smallest power of 2 greater than or equal to 5, the answer is 8.
```

```
Input: n = 16
Output: 16
Explanation: 16 is already a power of 2. Hence, the answer is 16.
```

 **Constraints:** 
1<= n <=109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-07T01:53:09.856Z  

```java
class Solution {
    static int nextPowerOfTwo(int n) {
        if (n <= 1) return 1;
        n--;
        n |= n >> 1;
        n |= n >> 2;
        n |= n >> 4;
        n |= n >> 8;
        n |= n >> 16;
        return n + 1;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/smallest-power-of-2-greater-than-or-equal-to-n2630/1)