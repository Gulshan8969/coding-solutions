# Convert Sentence to Camel Case

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a sentence  **s**, remove all spaces and convert it to Camel Case. In Camel Case, words are joined without spaces, the first word is converted to lowercase, and each subsequent word starts with an uppercase letter.

 **Note:**  It is guaranteed that s does not contain leading or trailing spaces.

 **Examples:** 

```
Input: s = "I got intern at geeksforgeeks"
Output: "iGotInternAtGeeksforgeeks"
Explanation: All spaces are removed and each word starts with a capital letter, except the first word which retains its original capitalization.
```

```
Input: s = "here comes the garden"
Output: "hereComesTheGarden"
Explanation: Spaces are removed and each word after the first is capitalized.
```

```
Input: s = "coding is fun"
Output: "codingIsFun"
Explanation: Spaces are removed, the first word retains its original case, and each subsequent word starts with a capital letter.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-27T10:38:54.303Z  

```java
class Solution {
    public String convertToCamelCase(String s) {
        // code here
       StringBuilder res = new StringBuilder();
       boolean capitalizeNext = false;
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)==' '){
               capitalizeNext=true;
           }
           else if(capitalizeNext==true){
        res.append(Character.toUpperCase(s.charAt(i)));
        capitalizeNext=false;
           }
           else{
               res.append(s.charAt(i));
           }
       }
       return res.toString();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/convert-sentence-to-camel-case/1)