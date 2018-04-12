/*
Suppose you have a random list of people standing in a queue. Each person is described by a pair of integers (h, k), where h is the height of the person and k is the number of people in front of this person who have a height greater than or equal to h. Write an algorithm to reconstruct the queue.

Note:
The number of people is less than 1,100.

Example
Input:
[[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]
Output:
[[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]
*/

class Solution {
    public int[][] reconstructQueue(int[][] people) {
        
        int[][] result = new int[people.length][2];
        for(int i=0; i<result.length; i++){
            for(int j=0; j<2; j++){
                result[i][j] = -1;
            }
        } 
        
        for(int j=0; j<people.length; j++){
            int shortestIndex = 0;
            for(int i=0; i<people.length; i++){
                int shortestHeight = people[shortestIndex][0];
                if(shortestHeight>people[i][0]){
                    shortestIndex = i;
                }
            }
            
            int k = -1;
            for(int i = 0; i<people.length; i++ ){
                if((result[i][0] == -1 && result[i][1] == -1)|| result[i][0] == people[shortestIndex][0]){
                    k++;                
                }
                    
                if(k == people[shortestIndex][1]){
                    result[i] = new int[]{people[shortestIndex][0], people[shortestIndex][1]};
                    people[shortestIndex][0] = Integer.MAX_VALUE;
                    break;
                }
            }
        }
        return result;
    }
}
