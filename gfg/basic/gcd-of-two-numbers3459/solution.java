import java.io.*;

class Solution {
    
    public  static int gcd(int a, int b){
    // {
    //     // Everything divides 0
    //     if(a==0 || b==0) return Math.max(a, b);

    //     // Find Minimum of a and b
    //     int result = Math.min(a, b);
    //     while (result > 0) {
    //         if (a % result == 0 && b % result == 0) {
    //             break;
    //         }
    //         result--;
    //     }

    //     // Return gcd of a and b
    //     return result;
    while(b!=0){
        int temp=b;
        b=a%b;
        a=temp;
    }
    return a;
    }
}

    
