class Solution {
    public ArrayList<Integer> xorArray(int[] arr) {
        // code her
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            arr[i]=arr[i]^arr[i+1];
        }
        ArrayList<Integer> res=new ArrayList<>();
        for(int x:arr){
            res.add(x);
        }
        return res;
    }
}