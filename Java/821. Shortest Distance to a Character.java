/*
Given a string S and a character C, return an array of integers representing the shortest distance from the character C in the string.

Example 1:
Input: S = "loveleetcode", C = 'e'
Output: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
 

Note:
S string length is in [1, 10000].
C is a single character, and guaranteed to be in string S.
All letters in S and C are lowercase.
*/

class Solution {
    public int[] shortestToChar(String S, char C) {
        
        int[] result = new int[S.length()];
        int index = 0;
        
        for(char c : S.toCharArray()){
            if(c == C){
                index++;
                continue;
            }
            else{
                int distance = 1;
                int left = index - distance;
                int right = index + distance;  
                while(left >= 0 || right < S.length()){
                    
                    left = index - distance;
                    right = index + distance;  
                    
                    if(left >= 0  && S.charAt(left) == C ){
                        result[index] = distance;
                        break;
                    }
                    if(right < S.length() && S.charAt(right) == C){
                        result[index] = distance;
                        break;
                    }
                    distance++;
                }
                index++;
            }
        }
        
        return result;
    }
}
