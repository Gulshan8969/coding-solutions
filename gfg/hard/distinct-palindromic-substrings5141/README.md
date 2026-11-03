# Distinct palindromic substrings

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given a string  **s**  of lowercase English letters. The task is to find all the  **distinct** continuous  **palindromic sub-strings**  which are present in the string  **s**.

 **Note:**  You can return the Palindromic sub-strings in any order but the driver code will print the result in  **sorted**  order.

 **Examples:** 

```
Input: s = "abaaa"
Output: ["a", "aa", "aaa", "aba", "b"]
Explanation: All 5 distinct continuous palindromic sub-strings are listed above.
```

```
Input: s = "geek"
Output: ["e", "ee", "g", "k"]
Explanation: All 4 distinct continuous palindromic sub-strings are listed above.
```

 **Constraints** :
1 ≤ s.length() ≤ 104

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-03T08:45:07.171Z  

```java
class Solution {
	public ArrayList<String> palindromicSubstr(String s) {
		// code here
		int n = s.length();
		HashSet<String>set=new HashSet<>();
		for (int c = 0; c<2*n - 1; c++) {
			int l = c / 2;
			int r = l + (c % 2); // same spot = odd, neighbors = even
			while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
				set.add(s.substring(l, r + 1));
				l--;
				r++;
				
			}
		}
		return new ArrayList<>(set);
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/distinct-palindromic-substrings5141/1)