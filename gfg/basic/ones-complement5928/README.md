# One's Complement

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a positive integer  **n**, find its one’s complement considering bits from the leftmost set bit to the last bit.

 **Examples:** 

```
Input: n = 5
Output: 2
Explanation: Binary of 5 is 101, 1's complement of 101 is 010, 010 is 2 in its decimal form. 
```

```
Input: n = 255
Output: 0
Explanation: Binary of 255 is 11111111, 1's complement of 11111111 is 00000000, 00000000 which is 0 in its decimal form. 
```

 **Constraints:** 
1 ≤ n ≤ 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-07T02:06:32.079Z  

```java
class Solution {
    static int onesComplement(int n) {
        if (n == 0) return 1;
        int bits = 32 - Integer.numberOfLeadingZeros(n);
        int mask = (bits == 32) ? -1 : (1 << bits) - 1;
        return n ^ mask;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/ones-complement5928/1)