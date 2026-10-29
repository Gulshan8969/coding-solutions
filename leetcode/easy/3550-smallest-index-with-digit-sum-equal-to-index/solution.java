// class Solution {
//     public int smallestIndex(int[] nums) {
//        for(int i=0;i<nums.length;i++)
//        {
//         int x=nums[i];
//         int sum=0;
//         while(x>0)
//         {
//             sum+=x%10;
//             x/=10;
//         }
//         if(sum==i) return i;
//        }
//        return -1; 
//     }
// }
class Solution {
    public int smallestIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int s = 0;
            for (int x = nums[i]; x > 0; x /= 10) s += x % 10;
            if (s == i) return i;
        }
        return -1;
    }
}