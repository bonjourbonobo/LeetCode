/*
Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle, which means it moves back to the original place.
The move sequence is represented by a string. And each move is represent by a character. The valid robot moves are R (Right), L (Left), U (Up) and D (down). The output should be true or false representing whether the robot makes a circle.

Example 1:
Input: "UD"
Output: true

Example 2:
Input: "LL"
Output: false
*/

class Solution {
    public boolean judgeCircle(String moves) {
        int xAxis = 0;
        int yAxis = 0;
        for(char c : moves.toCharArray()){
            if(c == 'U'){
                xAxis++;
            }
            if(c == 'D'){
                xAxis--;
            }
            if(c == 'R'){
                yAxis++;
            }
            if(c == 'L'){
                yAxis--;
            }
        }
        return (xAxis==0)&&(yAxis==0)?true:false;
    }
}
