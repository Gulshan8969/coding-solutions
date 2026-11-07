# Set Rightmost Unset Bit

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a non-negative number  **n**. The problem is to set the rightmost unset bit in the binary representation of  **n**.

 **Examples :** 

```
Input: n = 6
Output: 7
Explanation: The binary representation of 6 is 110. After setting right most bit it becomes 111 which is 7.
```

```
Input: n = 15
Output: 31
Explanation: The binary representation of 15 is 01111. After setting right most bit it becomes 11111 which is 31.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-07T00:52:01.272Z  

```java
class Solution {
    public int setBit(int n) {
        // All bits already set (e.g. 0111): n+1 is a power of two, so n & (n+1) == 0
        
        return n | (n + 1);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/set-the-rightmost-unset-bit4436/1)