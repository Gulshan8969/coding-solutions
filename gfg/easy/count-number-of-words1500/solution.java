class Solution {
    public int countWords(String s) {
        // code here
        String[] words = s.trim().split("\\s+");
                return words.length;
    }
}