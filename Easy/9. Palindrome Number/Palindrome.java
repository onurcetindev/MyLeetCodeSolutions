import java.util.Scanner;

public class Palindrome {
    /*
    Example 1:


    Input: x = 121
    Output: true
    Explanation: 121 reads as 121 from left to right and from right to left.
            Example 2:

    Input: x = -121
    Output: false
    Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
    Example 3:

    Input: x = 10
    Output: false
    Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

     */

    public boolean isPalindrome(int x) {

        int remainder;
        int reversedNumber = 0;
        int temp = x;

        while(x > 0){
            remainder = x % 10;
            reversedNumber = (reversedNumber * 10) + remainder;
            x = x / 10;
        }
        if(reversedNumber == temp){
            return true;
        }else{
            return false;
        }


    }
}


