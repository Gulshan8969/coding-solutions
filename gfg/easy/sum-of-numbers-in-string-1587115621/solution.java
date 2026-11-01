class Solution {
    public int findSum(String s) {
        int sum = 0;
        int curr = 0;                       // number being built

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                curr = curr * 10 + (ch - '0');   // extend the current number
            } else {
                sum += curr;                     // number ended, add it
                curr = 0;                        // start fresh
            }
        }
        sum += curr;                        // a number may end at the last character
        return sum;
    }
}