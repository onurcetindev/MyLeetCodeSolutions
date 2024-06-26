class Solution {

    /*
    Example 1:

    Input: x = 18

    Output: 9

    Explanation:

    The sum of digits of x is 9. 18 is divisible by 9. So 18 is a Harshad number and the answer is 9.

    Example 2:

    Input: x = 23

    Output: -1
    
    Explanation:

    The sum of digits of x is 5. 23 is not divisible by 5. So 23 is not a Harshad number and the answer is -1.
    */
    
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int temp = x ;
        int basamak;
        int sum = 0;
        while(x > 0){
            basamak = x % 10 ;
            x = x / 10;
            sum += basamak;
        }
        if(temp % sum == 0){
            return sum;
        }else{
            return -1;
        }
        
    }
}