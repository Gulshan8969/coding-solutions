class Solution {
    public static String reverseString(String s) {
        char[] cha = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            cha[i] = s.charAt(s.length() - 1 - i);
        }
        return new String(cha);
    }
}