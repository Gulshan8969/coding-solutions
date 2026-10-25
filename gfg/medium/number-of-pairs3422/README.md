# Count Power Pairs from Two Arrays

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two arrays  **a[]**  and  **b[]**. Find number of pairs such that  **xy > yx**  where  **x**  is an element from  **a[]**  and  **y**  is an element from  **b[]**.

Returns an integer denoting the number of pairs that are true to the given condition. 

 **Examples:** 

```
Input: a[] = [2, 1, 6], b[] = [1, 5]
Output: 3
Explanation: There are total 3 pairs where xy is greater than yx. The pairs are [2, 1], [2, 5] and [6, 1].
```

```
Input: a[] = [10, 19, 18], b[] = [11, 15, 9]
Output: 2
Explanation: There are total 2 pairs where xy is greater than yx. The pairs are [10, 11] and [10, 15].
```

 **Constraints:** 
1 ≤ a.size, b.size ≤ 104
1 ≤ a[i], b[i] ≤ 103

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-25T02:05:00.087Z  

```java
class Solution {
    public int countPairs(int[] a, int[] b) {
        // code here
    //   int count=0;
    //   for(int x:a){
    //       for(int y:b){
    //           if(y*Math.log(x)>x*Math.log(y)){
    //               count++;
    //           }
    //       }
    //   }
    //   return count;
    Arrays.sort(b);

            int m = b.length;
            int[] cnt = new int[5];            // counts of 0,1,2,3,4 in b
            for (int y : b) if (y < 5) cnt[y]++;

            long total = 0;
            for (int x : a) {
                if (x == 0) continue;          // 0^y is never > y^0

                if (x == 1) {                  // 1^y > y^1 only when y = 0
                    total += cnt[0];
                    continue;
                }

                // x >= 2
                total += m - upperBound(b, x); // y > x works
                total += cnt[0] + cnt[1];      // y = 0 and y = 1 always work

                if (x == 2) total -= cnt[3] + cnt[4]; // 2^3 < 3^2, 2^4 == 4^2
                if (x == 3) total += cnt[2];          // 3^2 > 2^3
            }
            return (int) total;
        }

        // index of first element > key in sorted array
        private int upperBound(int[] arr, int key) {
            int lo = 0, hi = arr.length;
            while (lo < hi) {
                int mid = (lo + hi) >>> 1;
                if (arr[mid] <= key) lo = mid + 1;
                else hi = mid;
            }
            return lo;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/number-of-pairs3422/1)