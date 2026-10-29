# Array Subset

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given two arrays  **a[]** and  **b[]**, your task is to determine whether  **b[]**  is a subset of  **a[]**.

 **Examples:** 

```
Input: a[] = [11, 7, 1, 13, 21, 3, 7, 3], b[] = [11, 3, 7, 1, 7]
Output: true
Explanation: b[] is a subset of a[]
```

```
Input: a[] = [1, 2, 3, 4, 4, 5, 6], b[] = [1, 2, 4]
Output: true
Explanation: b[] is a subset of a[]
```

```
Input: a[] = [10, 5, 2, 23, 19], b[] = [19, 5, 3]
Output: false
Explanation: b[] is not a subset of a[]
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-29T14:38:58.835Z  

```java
// import java.util.*;

// class Solution {
//     public boolean isSubset(int a[], int b[]) {
//         Arrays.sort(a);
//         Arrays.sort(b);

//         int i = 0, j = 0;
//         while (i < a.length && j < b.length) {
//             if (a[i] == b[j]) {
//                 i++;
//                 j++;
//             } else if (a[i] < b[j]) {
//                 i++;
//             } else {
//                 return false;
//             }
//         }

//         return j == b.length;
//     }
// }
import java.util.*;

class Solution {
    public boolean isSubset(int a[], int b[]) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int x : a) m.merge(x, 1, Integer::sum);          // a ki frequency count
        for (int x : b)
            if (m.merge(x, -1, Integer::sum) < 0) return false; // b ka element a mein kam pad gaya
        return true;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/array-subset-of-another-array2317/1)