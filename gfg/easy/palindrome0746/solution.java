class Solution {
    public boolean isPalindrome(int n) {
        // code here
        int reverse=0;
        int temp =Math.abs(n);
        while(temp!=0)
        {
            reverse=(reverse*10)+(temp%10);
            temp /=10;
        }
        return (reverse==Math.abs(n));
    }
}