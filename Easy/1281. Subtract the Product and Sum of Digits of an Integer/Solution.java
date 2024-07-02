class Solution {

       /*
          Example 1:

            Input: n = 234
            Output: 15 
            Explanation: 
            Product of digits = 2 * 3 * 4 = 24 
            Sum of digits = 2 + 3 + 4 = 9 
            Result = 24 - 9 = 15
        */

    public int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;

        while(n>0){
            int remainder = n % 10;
            
            sum += remainder;
            product *= remainder;

            n = n / 10;
        }

        return product - sum;
        
    }
}