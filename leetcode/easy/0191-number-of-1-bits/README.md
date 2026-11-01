# Number of 1 Bits

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a positive integer `n`, write a function that returns the number of set bits in its binary representation (also known as the Hamming weight).

 

 **Example 1:** 

 **Input:**  n = 11

 **Output:**  3

 **Explanation:** 

The input binary string  **1011**  has a total of three set bits.

 **Example 2:** 

 **Input:**  n = 128

 **Output:**  1

 **Explanation:** 

The input binary string  **10000000**  has a total of one set bit.

 **Example 3:** 

 **Input:**  n = 2147483645

 **Output:**  30

 **Explanation:** 

The input binary string  **1111111111111111111111111111101**  has a total of thirty set bits.

 

 **Constraints:** 

- 1 <= n <= 231 - 1

 

 **Follow up:**  If this function is called many times, how would you optimize it?

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 3.18%)  
**Memory:** 41.8 MB (beats 95.25%)  
**Submitted:** 2026-11-01T08:56:17.644Z  

```java
// class Solution {  //built in methods    
//     public int hammingWeight(int n) {
//         return Integer.bitCount(n);
//     }
// }
//string conversion
class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        for (char c : Integer.toBinaryString(n).toCharArray()) {
            if (c == '1') count++;
        }
        return count;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/number-of-1-bits/)