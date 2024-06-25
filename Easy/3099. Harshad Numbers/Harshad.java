class Solution {
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