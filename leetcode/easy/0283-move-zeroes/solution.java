// class Solution {
//     public void moveZeroes(int[] nums) {
//         int pos = 0; // next index where a non-zero should go

//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] != 0) {
//                 int temp = nums[pos];
//                 nums[pos] = nums[i];
//                 nums[i] = temp;
//                 pos++;
//             }
//         }
//     }
// }
class Solution {
    public void moveZeroes(int[] nums) {
        int k = 0;
        for (int x : nums)
            if (x != 0) nums[k++] = x;
        while (k < nums.length) nums[k++] = 0;
    }
}