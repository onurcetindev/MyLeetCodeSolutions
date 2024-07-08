class Solution {
   public static int findTheWinner(int n, int k) {
        ArrayList<Integer> friends = new ArrayList<>();
        
        // Initialize the list with friends numbered from 1 to n
        for (int i = 1; i <= n; i++) {
            friends.add(i);
        }

        int currentIndex = 0;

        // Continue removing friends until only one is left
        while (friends.size() > 1) {
            // Find the index of the friend to be removed
            currentIndex = (currentIndex + k - 1) % friends.size();
            // Remove the friend at currentIndex
            friends.remove(currentIndex);
        }

        // The last remaining friend is the winner
        return friends.get(0);
    }

}