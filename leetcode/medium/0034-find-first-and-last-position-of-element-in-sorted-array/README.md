# Find First and Last Position of Element in Sorted Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of integers `nums` sorted in non-decreasing order, find the starting and ending position of a given `target` value.

If `target` is not found in the array, return `[-1, -1]`.

You must write an algorithm with `O(log n)` runtime complexity.

 

 **Example 1:** 

```
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

```

 **Example 2:** 

```
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]

```

 **Example 3:** 

```
Input: nums = [], target = 0
Output: [-1,-1]

```

 

 **Constraints:** 

- 0 <= nums.length <= 105
- -109 <= nums[i] <= 109
- nums is a non-decreasing array.
- -109 <= target <= 109

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 47.5 MB (beats 92.97%)  
**Submitted:** 2026-11-02T02:09:51.624Z  

```java
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findBound(nums, target, true);
        if (first == -1) return new int[]{-1, -1};
        int last = findBound(nums, target, false);
        return new int[]{first, last};
    }

    private int findBound(int[] nums, int target, boolean isFirst) {
        int lo = 0, hi = nums.length - 1, ans = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] == target) {
                ans = mid;
                if (isFirst) hi = mid - 1;   // keep searching left
                else lo = mid + 1;           // keep searching right
            } else if (nums[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)