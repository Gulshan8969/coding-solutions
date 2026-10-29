// class Solution {
//     public int sumMatrix(int n, int q) {
//         int lo = Math.max(1, q - n);
//         int hi = Math.min(n, q - 1);
//         return Math.max(0, hi - lo + 1);
//     }
// }
class Solution {
    public int sumMatrix(int n, int q) {
        return Math.max(0, Math.min(n, q - 1) - Math.max(1, q - n) + 1);
    }
}