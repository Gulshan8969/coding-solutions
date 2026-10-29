class Solution {
    public int countKdivPairs(int[] arr, int k) {
        int[] c = new int[k];
        int ans = 0;
        for (int x : arr) {
            int r = ((x % k) + k) % k;      // negative ho to bhi remainder 0..k-1
            ans += c[(k - r) % k];          // pehle ke wo elements jinka remainder (k - r) hai
            c[r]++;
        }
        return ans;
    }
}