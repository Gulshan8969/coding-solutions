class Solution {
    public boolean canJump(int[] nums) {
        int farthest = 0; // farthest index reachable so far

        for (int i = 0; i < nums.length; i++) {
            // If the current index is beyond anything we can reach, we're stuck.
            if (i > farthest) return false;

            farthest = Math.max(farthest, i + nums[i]);

            if (farthest >= nums.length - 1) return true;
        }
        return true;
    }
}