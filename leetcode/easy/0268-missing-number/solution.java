// class Solution {
//     public int missingNumber(int[] nums) {
//         int n = nums.length;
//         int expectedSum = n * (n + 1) / 2;

//         int actualSum = 0;
//         for (int num : nums) {
//             actualSum += num;
//         }

//         return expectedSum - actualSum;
//     }
// }
class Solution {
    public int missingNumber(int[] nums) {
        int res = nums.length;
        for (int i = 0; i < nums.length; i++)
            res += i - nums[i];
        return res;
    }
}