/*
Given a non-empty 2D array grid of 0's and 1's, an island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.
Find the maximum area of an island in the given 2D array. (If there is no island, the maximum area is 0.)

Example 1:
[[0,0,1,0,0,0,0,1,0,0,0,0,0],
 [0,0,0,0,0,0,0,1,1,1,0,0,0],
 [0,1,1,0,1,0,0,0,0,0,0,0,0],
 [0,1,0,0,1,1,0,0,1,0,1,0,0],
 [0,1,0,0,1,1,0,0,1,1,1,0,0],
 [0,0,0,0,0,0,0,0,0,0,1,0,0],
 [0,0,0,0,0,0,0,1,1,1,0,0,0],
 [0,0,0,0,0,0,0,1,1,0,0,0,0]]
Given the above grid, return 6. Note the answer is not 11, because the island must be connected 4-directionally.

Example 2:
[[0,0,0,0,0,0,0,0]]
Given the above grid, return 0.

Note: The length of each dimension in the given grid does not exceed 50.
*/

class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == 1){
                    int area = computArea(i, j, grid);
                    maxArea = (maxArea > area) ? maxArea : area ;
                }
            }
        }
        return maxArea;
    }
    
    private int computArea(int i, int j, int[][] grid){
        
        int right = 0;
        int left = 0;
        int top = 0;
        int down = 0;
        
        if(grid[i][j] == 1){
            
            grid[i][j] = 0;
            if(i+1 < grid.length){
                right = computArea(i+1, j, grid);
            }
            if(i-1 >= 0){
                left = computArea(i-1, j, grid);
            }
            if(j+1 < grid[0].length){
                down = computArea(i, j+1, grid);
            }
            if(j-1 >= 0){
                top = computArea(i, j-1, grid);
            }
            return 1 + right + left + top + down;
        }
        else{
            return 0;
        }
    }
}
