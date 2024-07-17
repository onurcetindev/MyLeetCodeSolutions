import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {
    public int[] numberGame(int[] nums) {
        // Priority Queue to always get the minimum element first
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.add(num);
        }

        // Array to store the result
        int[] arr = new int[nums.length];
        int arrIndex = 0;

        // Loop until the heap is empty
        while (!minHeap.isEmpty()) {
            // Alice removes the minimum element
            int aliceChoice = minHeap.poll();
            // Bob removes the next minimum element (if available)
            int bobChoice = minHeap.poll();
            
            // Bob appends his choice first, then Alice
            arr[arrIndex++] = bobChoice;
            arr[arrIndex++] = aliceChoice;
        }

        return arr;
    }
}