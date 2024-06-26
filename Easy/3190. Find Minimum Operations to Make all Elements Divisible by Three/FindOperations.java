class Solution {
   /* 
    Example 1:

    Input: nums = [1,2,3,4]

    Output: 3

    Explanation:

    All array elements can be made divisible by 3 using 3 operations:

    Subtract 1 from 1.
    Add 1 to 2.
    Subtract 1 from 4.
    Example 2:

    Input: nums = [3,6,9]

    Output: 0
    */
    public int minimumOperations(int[] nums) {
        int operations = 0;
        for(int i = 0; i< nums.length; i++){
            if(nums[i] % 3 ==0 ){
                
            }else if(nums[i] % 3 == 1 ){
                operations++;
                
            }else if(nums[i] % 3 == 2 ){
                operations++;
                
            }
        }
        return operations;
        
    }
}