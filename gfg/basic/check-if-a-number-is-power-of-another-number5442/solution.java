class Solution {
    public boolean isPower(int x, int y) {
        // code here
        if (x == 1)
                   return (y == 1);

               // Repeatedly compute power of x
               long pow = 1;
               while (pow < y)
                   pow *= x;

               // Check if power of x becomes y
               return (pow == y);
           
    }
}