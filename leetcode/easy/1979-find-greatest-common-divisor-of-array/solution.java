class Solution {
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int n : nums) {
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        while (min != 0) {
            int t = max % min;
            max = min;
            min = t;
        }
        return max;
    }
}