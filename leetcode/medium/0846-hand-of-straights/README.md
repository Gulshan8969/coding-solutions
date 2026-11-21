# Hand of Straights

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Alice has some number of cards and she wants to rearrange the cards into groups so that each group is of size `groupSize`, and consists of `groupSize` consecutive cards.

Given an integer array `hand` where `hand[i]` is the value written on the `ith` card and an integer `groupSize`, return `true` if she can rearrange the cards, or `false` otherwise.

 

Original
Java
 **Example 1:** 

```
Input: hand = [1,2,3,6,2,3,4,7,8], groupSize = 3
Output: true
Explanation: Alice's hand can be rearranged as [1,2,3],[2,3,4],[6,7,8]

```

 **Example 2:** 

```
Input: hand = [1,2,3,4,5], groupSize = 4
Output: false
Explanation: Alice's hand can not be rearranged into groups of 4.

```

 

 **Constraints:** 

- 1 <= hand.length <= 104
- 0 <= hand[i] <= 109
- 1 <= groupSize <= hand.length

 

 **Note:**  This question is the same as 1296: https://leetcode.com/problems/divide-array-in-sets-of-k-consecutive-numbers/

## Solution

**Language:** Java  
**Runtime:** 34 ms (beats 65.84%)  
**Memory:** 48 MB (beats 27.55%)  
**Submitted:** 2026-11-21T02:58:54.435Z  

```java
import java.util.TreeMap;

class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) return false;

        TreeMap<Integer, Integer> count = new TreeMap<>();
        for (int card : hand) {
            count.merge(card, 1, Integer::sum);
        }

        while (!count.isEmpty()) {
            int first = count.firstKey(); // smallest remaining card must start a group

            for (int card = first; card < first + groupSize; card++) {
                Integer c = count.get(card);
                if (c == null) return false; // missing a consecutive card

                if (c == 1) count.remove(card);
                else count.put(card, c - 1);
            }
        }
        return true;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/hand-of-straights/)