class Solution {
    public int findPeakElement(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < nums[mid + 1]) {
                low = mid + 1;   // slope goes up, a peak lies to the right
            } else {
                high = mid;      // slope goes down, mid itself could be the peak
            }
        }
        return low;
    }
}