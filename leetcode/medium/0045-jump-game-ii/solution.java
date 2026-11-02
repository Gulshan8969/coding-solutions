class Solution {
    public int jump(int[] nums) {
        int currend=0;
        int jumps=0;
        int fastest=0;
        for(int i=0;i<nums.length-1;i++){
            fastest=Math.max(fastest,i+nums[i]);
            if(i==currend){
                jumps++;
                currend=fastest;
            }
        }
        return jumps;
    }

}