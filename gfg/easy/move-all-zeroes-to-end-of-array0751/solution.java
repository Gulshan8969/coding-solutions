class Solution {
    void pushZerosToEnd(int[] arr) {
        int k = 0;                          // agla non-zero element yahan jayega
        for (int x : arr)
            if (x != 0) arr[k++] = x;       // non-zero ko aage compact karo
        while (k < arr.length) arr[k++] = 0; // bacha hua hissa zeros se bhar do
    }
}