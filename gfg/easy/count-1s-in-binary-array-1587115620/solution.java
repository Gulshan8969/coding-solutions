class Solution {
    public int countOnes(int[] arr) {
        int low = 0, high = arr.length - 1;
        int firstZero = arr.length;   // if no 0 exists, all elements are 1

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == 1) {
                low = mid + 1;        // first 0 lies to the right
            } else {
                firstZero = mid;      // candidate; look for an earlier 0
                high = mid - 1;
            }
        }
        return firstZero;
    }
}