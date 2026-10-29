# Two Arrays Permutation Check

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two arrays  **a[]**  and  **b[]** of equal size, the task is to find whether the given arrays are permutation of each other. Two arrays are said to be permutation if both contain the same set of elements, arrangements of elements may be different though.

 **Note:**  If there are repetitions, then counts of repeated elements must also be the same for two arrays to be permutation.

 **Examples:** 

```
Input: a[] = [1, 2, 5, 4, 0], b[] = [2, 4, 5, 0, 1]
Output: true
Explanation: Both arrays contain the same elements and can be rearranged to [0, 1, 2, 4, 5]. Therefore, the output is true.

```

```
Input: a[] = [1, 2, 5], b[] = [2, 4, 15]
Output: false
Explanation: a[] and b[] have only one common value, 2. All others elements are different so the arrays cannot be rearranged to become equal. Therefore, the output is false.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-29T14:36:52.808Z  

```java
// class Solution {
//     public boolean checkPermutation(int[] a, int[] b) {
//         // code here
//       if(b.length> a.length)  return false;
//       Arrays.sort(a);
//       Arrays.sort(b);
//       int i = 0;
//               for (int x : b) {
//                   while (i < a.length && a[i] < x) i++;      // skip smaller elements of a
//                   if (i == a.length || a[i] != x) return false; // x not found
//                   i++;                                        // consume this match
//               }
//               return true;
//     }
// }
class Solution {
    public boolean checkPermutation(int[] a, int[] b) {
        if (a.length != b.length) return false;
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/check-if-two-arrays-are-equal-or-not3847/1)