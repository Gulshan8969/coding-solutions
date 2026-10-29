# Pyramid Pattern

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a number  **n**, print pyramid pattern with n lines.

 **Examples:** 

```
Input: n = 4 
Output:
   *
  ***
   *
  ***
```

```
Input: n = 5 
Output:
    *
   ***
    *
   ***
    *
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-29T01:52:10.371Z  

```java
import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/pyramid-patterns/1)