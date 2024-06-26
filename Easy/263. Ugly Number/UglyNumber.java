class Solution {

        /*        
        Example 1:

        Input: n = 6
        Output: true
        Explanation: 6 = 2 × 3
        Example 2:

        Input: n = 1
        Output: true
        Explanation: 1 has no prime factors, therefore all of its prime factors are limited to 2, 3, and 5.
        Example 3:

        Input: n = 14
        Output: false
        Explanation: 14 is not ugly since it includes the prime factor 7.
        */

        
    public boolean isUgly(int n) {
        if (n <= 0) {
            return false; // Ugly numbers must be positive
        }
        if(n == 1){
            return true;
        }
        int[] factors = {2, 3, 5};
        for (int factor : factors) {
            while (n % factor == 0) {
                n /= factor;
            }
        }
        return n == 1;
    }
}
