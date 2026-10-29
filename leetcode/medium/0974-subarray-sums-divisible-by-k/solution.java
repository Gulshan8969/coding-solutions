class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] c = new int[k];
        c[0] = 1;
        int s = 0, ans = 0;
        for (int x : nums) {
            s = ((s + x) % k + k) % k;
            ans += c[s]++;
        }
        return ans;
    }
}