class Solution {
    public int setBit(int n) {
        // All bits already set (e.g. 0111): n+1 is a power of two, so n & (n+1) == 0
        
        return n | (n + 1);
    }
}