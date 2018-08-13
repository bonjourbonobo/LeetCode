/*
On a N * N grid, we place some 1 * 1 * 1 cubes that are axis-aligned with the x, y, and z axes.
Each value v = grid[i][j] represents a tower of v cubes placed on top of grid cell (i, j).
Now we view the projection of these cubes onto the xy, yz, and zx planes.
A projection is like a shadow, that maps our 3 dimensional figure to a 2 dimensional plane. 
Here, we are viewing the "shadow" when looking at the cubes from the top, the front, and the side.
Return the total area of all three projections.

Example 1:
Input: [[2]]
Output: 5

Example 2:
Input: [[1,2],[3,4]]
Output: 17
Explanation: 
Here are the three projections ("shadows") of the shape made with each axis-aligned plane.

Example 3:
Input: [[1,0],[0,2]]
Output: 8

Example 4:
Input: [[1,1,1],[1,0,1],[1,1,1]]
Output: 14

Example 5:
Input: [[2,2,2],[2,1,2],[2,2,2]]
Output: 21
 
Note:
1 <= grid.length = grid[0].length <= 50
0 <= grid[i][j] <= 50
*/

//Solution 1
class Solution {
    public int projectionArea(int[][] grid) {
        int result = 0;
        int[] arrayMax = new int[grid[0].length];
        for(int[] row : grid){
            result += maxInArray(row);
            for(int i=0; i<row.length; i++){
                if(row[i] != 0){
                    result ++;
                }
                if(arrayMax[i] < row[i]){
                    arrayMax[i] = row[i];
                }
            }
        }
        for(int i : arrayMax){
            result += i;
        }
        return result;
    }
    
    public int maxInArray(int[] array) {
        int max = 0;
        for(int i : array){
            if(i>max){
                max = i;
            }
        }
        System.out.println(max);
        return max;
    }
}

//Solution 2
class Solution {
    public int projectionArea(int[][] grid) {
        int result = 0;
        for(int i = 0; i < grid.length; i++){
            int maxFront = 0;
            int maxSide = 0;
            int maxTop = 0;
            for(int j = 0; j < grid.length; j++){
                if(maxFront < grid[j][i]){
                    maxFront = grid[j][i];
                }  
                if(maxSide < grid[i][j]){
                    maxSide = grid[i][j];
                }
                if(grid[i][j] > 0){
                    maxTop += 1;
                }
            }
            result += maxFront;
            result += maxSide;
            result += maxTop;
        }
        return result;   
    }
}
