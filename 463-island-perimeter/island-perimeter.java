class Solution {
    public int islandPerimeter(int[][] grid) {
         // Initialize perimeter sum to 0.
        int perimeter = 0;
        // Get the number of rows in the grid.
        int rows = grid.length;
        // Get the number of columns in the grid.
        int cols = grid[0].length;
      
        // Iterate through the grid using nested loops.
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
              
                // Check if the current cell is land (1 indicates land).
                if (grid[i][j] == 1) {
                    // Add 4 for each land cell as it could potentially contribute 4 sides to the perimeter.
                    perimeter += 4;
                  
                    // If there is land directly below the current land, subtract 2 from perimeter count
                    // (one for the current cell's bottom side and one for the bottom cell's top side).
                    if (i < rows - 1 && grid[i + 1][j] == 1) {
                        perimeter -= 2;
                    }
                  
                    // If there is land directly to the right of the current land, subtract 2 from perimeter count
                    // (one for the current cell's right side and one for the right cell's left side).
                    if (j < cols - 1 && grid[i][j + 1] == 1) {
                        perimeter -= 2;
                    }
                }
            }
        }
      
        // Return the total perimeter of the island.
        return perimeter;
    }
}