# GCD of Two

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given two positive integers  **a**  and  **b**, find  **GCD** of a and b.

 **Note:**  Don't use the inbuilt gcd function

 **Examples:** 

```
Input: a = 20, b = 28
Output: 4
Explanation: GCD of 20 and 28 is 4
```

```
Input: a = 60, b = 36
Output: 12
Explanation: GCD of 60 and 36 is 12
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-29T01:36:03.014Z  

```java
import java.io.*;

class Solution {
    
    public  static int gcd(int a, int b){
    // {
    //     // Everything divides 0
    //     if(a==0 || b==0) return Math.max(a, b);

    //     // Find Minimum of a and b
    //     int result = Math.min(a, b);
    //     while (result > 0) {
    //         if (a % result == 0 && b % result == 0) {
    //             break;
    //         }
    //         result--;
    //     }

    //     // Return gcd of a and b
    //     return result;
    while(b!=0){
        int temp=b;
        b=a%b;
        a=temp;
    }
    return a;
    }
}

    

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1)