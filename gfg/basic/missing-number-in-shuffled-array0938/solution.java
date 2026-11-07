class Solution {
    public int findMissing(int[] arr1, int[] arr2) {
        // code here
       int res=0;
       for(int x:arr1) res ^=x;
       for(int x:arr2) res ^=x;
       return res;
    }
}