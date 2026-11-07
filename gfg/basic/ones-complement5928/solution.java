class Solution {
    static int onesComplement(int n) {
        if (n == 0) return 1;
        int bits = 32 - Integer.numberOfLeadingZeros(n);
        int mask = (bits == 32) ? -1 : (1 << bits) - 1;
        return n ^ mask;
    }
}