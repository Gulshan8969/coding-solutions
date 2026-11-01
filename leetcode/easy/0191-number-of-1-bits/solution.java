// class Solution {  //built in methods    
//     public int hammingWeight(int n) {
//         return Integer.bitCount(n);
//     }
// }
//string conversion
class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        for (char c : Integer.toBinaryString(n).toCharArray()) {
            if (c == '1') count++;
        }
        return count;
    }
}