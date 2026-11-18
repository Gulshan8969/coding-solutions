class Solution {
    public int splitArray(int[] nums, int k) {
        int lo = 0, hi = 0;
        for (int n : nums) {
            lo = Math.max(lo, n);
            hi += n;
        }

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (canSplit(nums, k, mid)) {
                hi = mid;       // mid works, try a smaller max sum
            } else {
                lo = mid + 1;   // too tight, need a larger max sum
            }
        }
        return lo;
    }

    private boolean canSplit(int[] nums, int k, int limit) {
        int parts = 1, curr = 0;
        for (int n : nums) {
            if (curr + n > limit) {
                parts++;        // start a new subarray
                curr = n;
                if (parts > k) return false;
            } else {
                curr += n;
            }
        }
        return true;
    }
}