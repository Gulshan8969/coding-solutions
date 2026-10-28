class Solution {
    static boolean checkYear(int n) {
        // code here
        // if(n%4==0)
        // {
        //     if(n%100==0)
        //     {
        //         return n%400==0;
        //     }
        //     return true;
        // }
        // return false;
        if (n % 4 == 0 && (n % 100 != 0 || n % 400 == 0)) {
                    return true;
                }
                return false;
       
    }
}
        
            
        
    
