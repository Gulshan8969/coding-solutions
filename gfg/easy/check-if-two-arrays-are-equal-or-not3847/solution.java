// class Solution {
//     public boolean checkPermutation(int[] a, int[] b) {
//         // code here
//       if(b.length> a.length)  return false;
//       Arrays.sort(a);
//       Arrays.sort(b);
//       int i = 0;
//               for (int x : b) {
//                   while (i < a.length && a[i] < x) i++;      // skip smaller elements of a
//                   if (i == a.length || a[i] != x) return false; // x not found
//                   i++;                                        // consume this match
//               }
//               return true;
//     }
// }
class Solution {
    public boolean checkPermutation(int[] a, int[] b) {
        if (a.length != b.length) return false;
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }
}