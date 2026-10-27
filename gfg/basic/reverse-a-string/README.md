# Reverse a String

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **s**, reverse the string.

 **Examples:** 

```
Input: s = "Geeks"
Output: "skeeG"

```

```
Input: s = "for"
Output: "rof"
```

```
Input: s = "a"
Output: "a"
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-27T09:22:02.606Z  

```java
class Solution {
    public static String reverseString(String s) {
        // char[] cha = new char[s.length()];
        // for (int i = 0; i < s.length(); i++) {
        //     cha[i] = s.charAt(s.length() - 1 - i);
        // }
        // return new String(cha);
        StringBuilder sb =new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/reverse-a-string/1)