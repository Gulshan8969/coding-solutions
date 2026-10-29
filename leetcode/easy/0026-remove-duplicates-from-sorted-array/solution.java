// class Solution {
//     public int removeDuplicates(int[] nums) {
//         if (nums.length == 0) return 0;

//         int i = 1; // next position for a unique element
//         for (int j = 1; j < nums.length; j++) {
//             if (nums[j] != nums[i - 1]) {
//                 // swap nums[i] and nums[j]
//                 int temp = nums[i];
//                 nums[i] = nums[j];
//                 nums[j] = temp;
//                 i++;
//             }
//         }
//         return i;
//     }
// }
class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int x : nums)
            if (i == 0 || x != nums[i - 1]) nums[i++] = x;
        return i;
    }
}
