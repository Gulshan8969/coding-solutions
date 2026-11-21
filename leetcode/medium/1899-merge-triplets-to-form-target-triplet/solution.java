class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        boolean a = false, b = false, c = false; // is each target value matched?

        for (int[] t : triplets) {
            // A triplet with any value above the target would overshoot, so skip it.
            if (t[0] > target[0] || t[1] > target[1] || t[2] > target[2]) continue;

            if (t[0] == target[0]) a = true;
            if (t[1] == target[1]) b = true;
            if (t[2] == target[2]) c = true;
        }
        return a && b && c;
    }
}