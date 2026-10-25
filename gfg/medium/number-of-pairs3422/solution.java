class Solution {
    public int countPairs(int[] a, int[] b) {
        // code here
    //   int count=0;
    //   for(int x:a){
    //       for(int y:b){
    //           if(y*Math.log(x)>x*Math.log(y)){
    //               count++;
    //           }
    //       }
    //   }
    //   return count;
    Arrays.sort(b);

            int m = b.length;
            int[] cnt = new int[5];            // counts of 0,1,2,3,4 in b
            for (int y : b) if (y < 5) cnt[y]++;

            long total = 0;
            for (int x : a) {
                if (x == 0) continue;          // 0^y is never > y^0

                if (x == 1) {                  // 1^y > y^1 only when y = 0
                    total += cnt[0];
                    continue;
                }

                // x >= 2
                total += m - upperBound(b, x); // y > x works
                total += cnt[0] + cnt[1];      // y = 0 and y = 1 always work

                if (x == 2) total -= cnt[3] + cnt[4]; // 2^3 < 3^2, 2^4 == 4^2
                if (x == 3) total += cnt[2];          // 3^2 > 2^3
            }
            return (int) total;
        }

        // index of first element > key in sorted array
        private int upperBound(int[] arr, int key) {
            int lo = 0, hi = arr.length;
            while (lo < hi) {
                int mid = (lo + hi) >>> 1;
                if (arr[mid] <= key) lo = mid + 1;
                else hi = mid;
            }
            return lo;
    }
}
