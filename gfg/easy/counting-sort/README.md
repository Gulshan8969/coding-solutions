# Counting Sort

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string  **s**  consisting of lowercase english letters, arrange all its letters in lexicographical order using Counting Sort.

 **Examples:** 

```
Input: s = "edsab"
Output: abdes
Explanation: In lexicographical order, s will be abdes.

```

```
Input: s = "geeksforgeeks"
Output: eeeefggkkorss
Explanation:In lexicographical order, s will be eeeefggkkorss.
```

 **Constraints:** 
1 ≤ s.size() ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-25T01:46:39.095Z  

```java
class Solution {
    public static String countSort(String s) {
        // code here
        int [] count=new  int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }
        char [] result=new char [s.length()];
        int idx=0;
        for(int c=0;c<26;c++){
            while(count[c]-->0){
                result[idx++]=(char)('a'+c);
            }
        }
        return new String (result);
    }
    
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/counting-sort/1)