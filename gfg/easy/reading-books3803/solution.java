// class Solution {
//     public int maxPoint(int k, int[] arr1, int[] arr2) {
//         // code
//         int res=0;
//         for(int i=0;i<arr1.length;i++)
//         {
//             int points=k/arr1[i]*arr2[i];
//             res=Math.max(res,points);
//         }
//         return res;
//     }
// }
class Solution {
    public int maxPoint(int k, int[] arr1, int[] arr2) {
        int res = 0;
        for (int i = 0; i < arr1.length; i++)
            res = Math.max(res, k / arr1[i] * arr2[i]);
        return res;
    }
}