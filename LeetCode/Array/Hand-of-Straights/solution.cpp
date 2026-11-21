class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n=hand.length;
        if(n%3==0){
            return true;
        }
        return false;
    }
}