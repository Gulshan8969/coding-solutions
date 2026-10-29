class Solution {
    public long nPr(int n, int r) {
        // if (r > n) return 0;

        // long ans = 1;
        // for (int i = 0; i < r; i++) {
        //     ans *= (n - i);
        // }
        // return ans;
        if(r>n) return 0;
        long ans=1;
        for(int i=0;i<r;i++){
            ans*=(n-i);
        }
        return ans;
    }
}