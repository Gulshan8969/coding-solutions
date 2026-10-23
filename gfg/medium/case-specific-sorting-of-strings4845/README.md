# Case Specific Sorting of Strings

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string  **s** consisting of only uppercase and lowercase characters. The task is to sort uppercase and lowercase letters separately such that if the ith place in the original string had an Uppercase character then it should not have a lowercase character after being sorted and vice versa.

**Examples :
**

```
Input: s = "GEekS"
Output: EGekS
Explanation: Sorted form of given string with the same case of character will result in output as EGekS.
```

```
Input: s = "XWMSPQ"
Output: MPQSWX
Explanation: Since all characters are of the same case We can simply perform a sorting operation on the entire string.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-23T16:19:29.455Z  

```java
import java.util.*;

class Solution {
    public static String caseSort(String s) {
        int n = s.length();
        char[] lower = new char[n], upper = new char[n];
        int lc = 0, uc = 0;

        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) lower[lc++] = c;
            else upper[uc++] = c;
        }

        Arrays.sort(lower, 0, lc);
        Arrays.sort(upper, 0, uc);

        StringBuilder sb = new StringBuilder(n);
        int l = 0, u = 0;
        for (int i = 0; i < n; i++) {
            if (Character.isLowerCase(s.charAt(i))) sb.append(lower[l++]);
            else sb.append(upper[u++]);
        }
        return sb.toString();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/case-specific-sorting-of-strings4845/1)