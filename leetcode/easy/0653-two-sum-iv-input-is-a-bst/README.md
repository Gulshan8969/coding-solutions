# Two Sum IV - Input is a BST

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the `root` of a binary search tree and an integer `k`, return `true`  *if there exist two elements in the BST such that their sum is equal to*  `k`,  *or*  `false`  *otherwise*.

 

 **Example 1:** 

```
Input: root = [5,3,6,2,4,null,7], k = 9
Output: true

```

 **Example 2:** 

```
Input: root = [5,3,6,2,4,null,7], k = 28
Output: false

```

 

 **Constraints:** 

- The number of nodes in the tree is in the range [1, 104].
- -104 <= Node.val <= 104
- root is guaranteed to be a valid binary search tree.
- -105 <= k <= 105

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 83.01%)  
**Memory:** 46.9 MB (beats 87.36%)  
**Submitted:** 2026-11-11T01:36:29.350Z  

```java
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        return dfs(root, k, new HashSet<>());
    }

    private boolean dfs(TreeNode node, int k, Set<Integer> seen) {
        if (node == null) {
            return false;
        }
        if (seen.contains(k - node.val)) {
            return true;
        }
        seen.add(node.val);
        return dfs(node.left, k, seen) || dfs(node.right, k, seen);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/two-sum-iv-input-is-a-bst/)