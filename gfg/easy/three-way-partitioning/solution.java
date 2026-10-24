class Solution {
    public void threeWayPartition(int arr[], int a, int b) {
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] < a) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] > b) {
                swap(arr, mid, high);
                high--;          // don't move mid: the swapped-in value is unchecked
            } else {
                mid++;           // a <= arr[mid] <= b, already in the right zone
            }
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}