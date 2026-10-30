# Diagonal Traverse II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a 2D integer array `nums`, return  *all elements of* `nums` *in diagonal order as shown in the below images*.

 

 **Example 1:** 

```
Input: nums = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,4,2,7,5,3,8,6,9]

```

 **Example 2:** 

```
Input: nums = [[1,2,3,4,5],[6,7],[8],[9,10,11],[12,13,14,15,16]]
Output: [1,6,2,8,7,3,9,4,12,10,5,13,11,14,15,16]

```

 

 **Constraints:** 

- 1 <= nums.length <= 105
- 1 <= nums[i].length <= 105
- 1 <= sum(nums[i].length) <= 105
- 1 <= nums[i][j] <= 105

## Solution

**Language:** Java  
**Runtime:** 36 ms (beats 55.44%)  
**Memory:** 125.6 MB (beats 31.90%)  
**Submitted:** 2026-10-30T08:00:31.233Z  

```java
class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        HashMap<Integer, List<Integer>> hp = new HashMap<>();
        int total = 0, maxDia = 0;

        for (int i = nums.size() - 1; i >= 0; i--) {
            for (int j = 0; j < nums.get(i).size(); j++) {
                int dia = i + j;
                hp.computeIfAbsent(dia, k -> new ArrayList<>()).add(nums.get(i).get(j));
                maxDia = Math.max(maxDia, dia);
                total++;
            }
        }

        int[] result = new int[total];
        int idx = 0;
        for (int d = 0; d <= maxDia; d++) {
            for (int val : hp.get(d)) result[idx++] = val;
        }
        return result;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/diagonal-traverse-ii/)