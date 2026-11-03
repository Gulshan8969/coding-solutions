class Solution {
	public ArrayList<String> palindromicSubstr(String s) {
		// code here
		int n = s.length();
		HashSet<String>set=new HashSet<>();
		for (int c = 0; c<2*n - 1; c++) {
			int l = c / 2;
			int r = l + (c % 2); // same spot = odd, neighbors = even
			while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
				set.add(s.substring(l, r + 1));
				l--;
				r++;
				
			}
		}
		return new ArrayList<>(set);
	}
}
