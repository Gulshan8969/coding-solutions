class Solution {
    String removeVowels(String s) {
        // code here
        return s.replaceAll("[aeiouAEIOU]", "");
    }
}