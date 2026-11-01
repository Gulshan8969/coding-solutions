class Solution {
    public int getSum(int a, int b) {
        while (b != 0) {
            int carry = (a & b) << 1;  // positions where both bits are 1 produce a carry to the next bit
            a = a ^ b;                 // addition without carry
            b = carry;                 // add the carry in the next iteration
        }
        return a;
    }
}