# Sum of Two Integers

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two integers `a` and `b`, return  *the sum of the two integers without using the operators*  `+`  *and*  `-`.

 

 **Example 1:** 

```
Input: a = 1, b = 2
Output: 3

```

 **Example 2:** 

```
Input: a = 2, b = 3
Output: 5

```

 

 **Constraints:** 

- -1000 <= a, b <= 1000

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 41.6 MB (beats 88.13%)  
**Submitted:** 2026-11-01T08:53:05.314Z  

```java
class Solution {
    public int getSum(int a, int b) {
        while (b != 0) {
            int carry = (a & b) << 1;  // positions where both bits are 1 produce a carry to the next bit
            a = a ^ b;                 // addition without carry
            b = carry;                 // add the carry in the next iteration
        }
        return a;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/sum-of-two-integers/)