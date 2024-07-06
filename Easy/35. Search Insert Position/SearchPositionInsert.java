class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target <= nums[i]) {
                return i; // Hedef veya hedeften büyük ilk elemanın indeksini döndür
            }
        }
        return nums.length; // Hedef dizinin en büyük elemanından büyükse, dizinin sonuna eklenecek
    }
}