# Sqrt(x)

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a non-negative integer `x`, return  *the square root of* `x` *rounded down to the nearest integer*. The returned integer should be  **non-negative**  as well.

You  **must not use**  any built-in exponent function or operator.

- For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

 

Original
Java
 **Example 1:** 

```
Input:int x = 4;Output: 2
Explanation: The square root of 4 is 2, so we return 2.

```

 **Example 2:** 

```
Input:int x = 8;Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.

```

 

 **Constraints:** 

- 0 <= x <= 231 - 1

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 53.15%)  
**Memory:** 42.3 MB (beats 55.00%)  
**Submitted:** 2026-11-17T10:24:16.785Z  

```java

class Solution {
    public int mySqrt(int x) {
        // sqrt = Math.sqrt(x);
        // if(sqrt(x)==i){
        //     System.out.println("done");
        // }
        // else{
        //     System.out.println("not possible");
        // }
        int l=0;
        int r=x;
        int ans=0;
        while(l<=r){
            int mid=l+(r-l)/2;
            long square=(long)mid *(long)mid;
            if(square>(long) x){
               r=mid-1; 
            }
            else {
                ans=mid;
                l=mid+1;
            }
        }
        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/sqrtx/)