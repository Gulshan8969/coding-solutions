import java.util.*;

class Solution {
    public static String caseSort(String s) {
        int n = s.length();
        char[] lower = new char[n], upper = new char[n];
        int lc = 0, uc = 0;

        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) lower[lc++] = c;
            else upper[uc++] = c;
        }

        Arrays.sort(lower, 0, lc);
        Arrays.sort(upper, 0, uc);

        StringBuilder sb = new StringBuilder(n);
        int l = 0, u = 0;
        for (int i = 0; i < n; i++) {
            if (Character.isLowerCase(s.charAt(i))) sb.append(lower[l++]);
            else sb.append(upper[u++]);
        }
        return sb.toString();
    }
}