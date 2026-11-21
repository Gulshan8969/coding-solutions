class Solution:
    def canJump(self, nums):
        farthest = 0  # farthest index reachable so far

        for i, jump in enumerate(nums):
            # If the current index is beyond anything we can reach, we're stuck.
            if i > farthest:
                return False

            farthest = max(farthest, i + jump)

            if farthest >= len(nums) - 1:
                return True

        return True