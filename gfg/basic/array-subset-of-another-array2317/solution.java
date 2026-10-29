// import java.util.*;

// class Solution {
//     public boolean isSubset(int a[], int b[]) {
//         Arrays.sort(a);
//         Arrays.sort(b);

//         int i = 0, j = 0;
//         while (i < a.length && j < b.length) {
//             if (a[i] == b[j]) {
//                 i++;
//                 j++;
//             } else if (a[i] < b[j]) {
//                 i++;
//             } else {
//                 return false;
//             }
//         }

//         return j == b.length;
//     }
// }
import java.util.*;

class Solution {
    public boolean isSubset(int a[], int b[]) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int x : a) m.merge(x, 1, Integer::sum);          // a ki frequency count
        for (int x : b)
            if (m.merge(x, -1, Integer::sum) < 0) return false; // b ka element a mein kam pad gaya
        return true;
    }
}