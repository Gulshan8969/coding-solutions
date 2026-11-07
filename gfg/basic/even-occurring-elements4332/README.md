# Even Occurring Elements

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array arr[] of integers, find and return the elements with even occurrences in the array. If no such element exists, return -1. Elements should be returned in order of occurrence.

 **Examples** :

```
Input: arr[] = [9, 12, 23, 10, 12, 12, 15, 23, 14, 12, 15]
Output: [12, 15, 23]
Explanation: The numbers 12, 15, and 23 each appear an even number of times.
```

```
Input: arr[] = [23, 12, 56, 34, 32]
Output: [-1]
Explanation: Every number in the array occurs an odd number of times.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-07T01:47:52.177Z  

```java
import java.util.*;

class Solution {
    public ArrayList<Integer> findEvenOccurrences(int[] arr) {
        LinkedHashMap<Integer, Integer> freq = new LinkedHashMap<>();
        for (int x : arr) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        ArrayList<Integer> res = new ArrayList<>();
        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            if (e.getValue() % 2 == 0) {
                res.add(e.getKey());
            }
        }

        if (res.isEmpty()) {
            res.add(-1);
        }
        return res;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/even-occurring-elements4332/1)