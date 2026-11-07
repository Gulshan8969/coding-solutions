# One Odd Occuring

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array of  **arr[]** positive integers where all numbers occur even number of times except one number which occurs odd number of times. Return that number.

 **Examples:** 

```
Input:arr[] = [1, 2, 3, 2, 3, 1, 3]
Output: 3
Explanation: 3 occurs three times.

```

```
Input:arr[] = [5, 7, 2, 7, 5, 2, 5]
Output: 5
Explanation: 5 occurs three times.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-07T00:40:19.082Z  

```java
class Solution {
    // Method to find the element with odd occurrence in given array
    int getOddOccurrence(int[] arr) {
        // code here
        int count=0;
        for(int x:arr){
            count^=x;
        }
        return count;
            
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-the-odd-occurence4820/1)