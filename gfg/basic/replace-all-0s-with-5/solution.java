class Solution {
    public int convertFive(int n) {
        if (n == 0) return 5;      // edge case: 0 ko 5 banana hai

        int ans = 0;
        int place = 1;

        while (n > 0) {
            int digit = n % 10;
            if (digit == 0) digit = 5;

            ans += digit * place;
            place *= 10;
            n /= 10;
        }
        return ans;
    }
}