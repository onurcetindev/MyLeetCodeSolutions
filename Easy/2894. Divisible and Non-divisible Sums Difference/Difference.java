class Solution {

    /* Example 1:

        Input: n = 10, m = 3
        Output: 19
        Explanation: In the given example:
        - Integers in the range [1, 10] that are not divisible by 3 are [1,2,4,5,7,8,10], num1 is the sum of those integers = 37.
        - Integers in the range [1, 10] that are divisible by 3 are [3,6,9], num2 is the sum of those integers = 18.
        We return 37 - 18 = 19 as the answer
        */
    public int differenceOfSums(int n, int m) {

        int divisible = 0;
        int not_divisible = 0;

        for(int i = 0; i<=n; i++){
            if(i % m != 0){
                not_divisible += i;
            }else{
                divisible += i;
            }
        }
        return not_divisible - divisible;
    }
}