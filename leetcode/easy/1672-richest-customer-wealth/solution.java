// class Solution {
//     public int maximumWealth(int[][] accounts) {
//         int max = 0;

//         for (int i = 0; i < accounts.length; i++) {
//             int sum = 0;
//             for (int j = 0; j < accounts[i].length; j++) {
//                 sum += accounts[i][j];
//             }
//             max = Math.max(max, sum);
//         }

//         return max;
//     }
// }
import java.util.Arrays;

class Solution {
    public int maximumWealth(int[][] accounts) {
        return Arrays.stream(accounts)
                     .mapToInt(row -> Arrays.stream(row).sum())
                     .max()
                     .getAsInt();
    }
}