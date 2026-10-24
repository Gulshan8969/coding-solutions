class Solution {
    void segregate0and1(int[] arr) {
        //your code
        //Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] == 0) {
                left++;
            } else if (arr[right] == 1) {
                right--;
            } else {
                // arr[left] == 1 and arr[right] == 0, so swap them
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
}