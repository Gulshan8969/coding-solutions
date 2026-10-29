class Solution {
    public int maxConsecBits(int[] arr) {
        int cur = 1, max = 1;
        for (int i = 1; i < arr.length; i++) {
            cur = (arr[i] == arr[i - 1]) ? cur + 1 : 1;
            max = Math.max(max, cur);
        }
        return max;
    }
}