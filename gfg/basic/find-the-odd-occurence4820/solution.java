class Solution {
    // Method to find the element with odd occurrence in given array
    int getOddOccurrence(int[] arr) {
        // code here
        int count=0;
        for(int x:arr){
            count^=x;
        }
        return count;
            
    }
}