class Solution {
    public int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        
        // Start from the bottom-left corner
        int row = m - 1;
        int col = 0;
        
        while (row >= 0 && col < n) {
            if (grid[row][col] < 0) {
                // If this is negative, then all elements to the right 
                // in this row are also negative.
                count += (n - col);
                // Move to the row above
                row--;
            } else {
                // If this is non-negative, move to the right column
                col++;
            }
        }
        
        return count;
    }
}