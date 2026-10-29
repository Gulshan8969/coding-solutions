import java.util.*;

class Solution {
    public int getSecondLargest(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);

        // peeche se pehla aisa element dhundo jo largest se alag ho
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != arr[n - 1]) {
                return arr[i];
            }
        }
        return -1;   // sab elements same hain
    }
}