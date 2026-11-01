class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int max = 0;

        while (left < right) {
            int h = Math.min(height[left], height[right]);
            max = Math.max(max, h * (right - left));

            // skip all lines that can't beat the current limiting height
            while (left < right && height[left] <= h) left++;
            while (left < right && height[right] <= h) right--;
        }
        return max;
    }
}
