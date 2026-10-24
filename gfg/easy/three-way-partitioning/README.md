# Three Way Partitioning

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array  **arr[]**  and a range  **a**,  **b**. The task is to partition the array around the range such that the array is divided into three parts.

- All elements smaller than a come first.
- All elements in range a to b come next.
- All elements greater than b appear in the end.

The individual elements of three sets can appear in any order. You are required to return the modified array.

 **Note** : The generated output is true if you modify the given array successfully. Otherwise false.

 **Examples:** 

```
Input: arr[] = [1, 2, 3, 3, 4], a = 1, b = 2
Output: true
Explanation: One possible arrangement is: {1, 2, 3, 3, 4}. If you return a valid arrangement, output will be true.

```

```
Input: arr[] = [1, 4, 3, 6, 2, 1], a = 1, b = 3
Output: true
Explanation: One possible arrangement is: {1, 3, 2, 1, 4, 6}. If you return a valid arrangement, output will be true.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-24T05:54:02.760Z  

```java
class Solution {
    public void threeWayPartition(int arr[], int a, int b) {
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] < a) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] > b) {
                swap(arr, mid, high);
                high--;          // don't move mid: the swapped-in value is unchecked
            } else {
                mid++;           // a <= arr[mid] <= b, already in the right zone
            }
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/three-way-partitioning/1)