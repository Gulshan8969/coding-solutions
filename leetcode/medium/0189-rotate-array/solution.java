class Solution {
    public void rotate(int[] nums, int k) {
    //     int n = nums.length;
    //     k = k % n;
    //     if (k == 0) return;

    //     reverse(nums, 0, n - 1);
    //     reverse(nums, 0, k - 1);
    //     reverse(nums, k, n - 1);
    // }                               // <-- close rotate here

    // private void reverse(int[] nums, int left, int right) {
    //     while (left < right) {
    //         int temp = nums[left];
    //         nums[left] = nums[right];
    //         nums[right] = temp;
    //         left++;
    //         right--;
    //     }
    int n=nums.length;
    int[] t = new int[n];
for (int i = 0; i < n; i++) t[(i + k) % n] = nums[i];
System.arraycopy(t, 0, nums, 0, n);
    }
}