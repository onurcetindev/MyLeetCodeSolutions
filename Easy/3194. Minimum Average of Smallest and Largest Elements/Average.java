import java.util.Arrays;

class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        double[] averages = new double[n / 2];

        int left = 0;
        int right = n - 1;

        for (int i = 0; i < n / 2; i++) { // Adjusted loop condition to n/2
            int min = nums[left];
            int max = nums[right];
            averages[i] = (min + max) / 2.0;
            left++;
            right--;
        }

        double minAverage = averages[0];
        for (double avg : averages) {
            if (avg < minAverage) {
                minAverage = avg;
            }
        }

        return minAverage;
    }
}
