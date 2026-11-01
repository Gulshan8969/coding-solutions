class Solution {
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result = (result << 1) | (n & 1);  // append n's lowest bit
            n >>>= 1;                          // move to the next bit
        }
        return result;
    }
}