
class Solution {
    public int mySqrt(int x) {
        // sqrt = Math.sqrt(x);
        // if(sqrt(x)==i){
        //     System.out.println("done");
        // }
        // else{
        //     System.out.println("not possible");
        // }
        int l=0;
        int r=x;
        int ans=0;
        while(l<=r){
            int mid=l+(r-l)/2;
            long square=(long)mid *(long)mid;
            if(square>(long) x){
               r=mid-1; 
            }
            else {
                ans=mid;
                l=mid+1;
            }
        }
        return ans;
    }
}