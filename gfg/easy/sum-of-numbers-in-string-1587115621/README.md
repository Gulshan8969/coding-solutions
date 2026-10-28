# Sum Numbers in String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string  **s** containing alphanumeric characters. You have to calculate the sum of all the numbers present in the string.

 **Examples:** 

```
Input: s = "1abc23"
Output: 24
Explanation: 1 and 23 are numbers in the string which is added to get the sum as 24.

```

```
Input: s = "geeks4geeks"
Output: 4
Explanation: 4 is the only number, so the sum is 4.
```

 **Constraints:** 
1 ≤ |s|≤ 105
The sum of Numbers ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-28T10:31:09.375Z  

```java
class Solution {
    public static int findSum(String s) {
        // code here
        String temp = "0";

               // holds sum of all numbers present in the string
               int sum = 0;

               // read each character in input string
               for (int i = 0; i < s.length(); i++) {
                   char ch = s.charAt(i);

                   // if current character is a digit
                   if (Character.isDigit(ch))
                       temp += ch;

                   // if current character is an alphabet
                   else {
                       // increment sum by number found earlier
                       // (if any)
                       sum += Integer.parseInt(temp);

                       // reset temporary string to empty
                       temp = "0";
                   }
               }

               // atoi(temp.c_str()) takes care of trailing
               // numbers
               return sum + Integer.parseInt(temp);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sum-of-numbers-in-string-1587115621/1)