// class Solution {
//     public void rotateArr(int arr[], int d) {
//         // code here
//         int n=arr.length;
//         for(int i=0;i<d;i++)
//         {
//             int first=arr[0];
//             for(int j=0;j<n-1;j++)
//             {
//                 arr[j]=arr[j+1];
//             }
//             arr[n-1]=first;
//         }
//     }
// }
class Solution {
    public void rotateArr(int arr[], int d) {
        int n = arr.length;
        d %= n;
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    private void reverse(int[] a, int i, int j) {
        for (; i < j; i++, j--) { int t = a[i]; a[i] = a[j]; a[j] = t; }
    }
}