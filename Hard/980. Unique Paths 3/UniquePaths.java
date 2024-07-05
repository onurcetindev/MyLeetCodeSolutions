class Solution {
    private int[][] grid;
    private int rows, cols;
    private int totalEmpty;
    private int result;
    
    public int uniquePathsIII(int[][] grid) {
        this.grid = grid;
        rows = grid.length;
        cols = grid[0].length;
        int startX = 0, startY = 0;
        totalEmpty = 0;
        
        // Initialize start position and count the total number of empty squares
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    startX = i;
                    startY = j;
                }
                if (grid[i][j] == 0) {
                    totalEmpty++;
                }
            }
        }
        
        result = 0;
        // Start the DFS from the start position
        dfs(startX, startY, -1);
        
        return result;
    }
    
    private void dfs(int x, int y, int count) {
        // Check if we are out of bounds or on an obstacle
        if (x < 0 || y < 0 || x >= rows || y >= cols || grid[x][y] == -1) {
            return;
        }
        
        // If we reach the end square
        if (grid[x][y] == 2) {
            // Check if we have walked over every non-obstacle square exactly once
            if (count == totalEmpty) {
                result++;
            }
            return;
        }
        
        // Save the current cell value and mark it as an obstacle to avoid revisiting
        int temp = grid[x][y];
        grid[x][y] = -1;
        
        // Explore 4 directions
        dfs(x + 1, y, count + 1);
        dfs(x - 1, y, count + 1);
        dfs(x, y + 1, count + 1);
        dfs(x, y - 1, count + 1);
        
        // Restore the current cell value
        grid[x][y] = temp;
    }
}
    