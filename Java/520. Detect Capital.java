/*
Given a word, you need to judge whether the usage of capitals in it is right or not.
We define the usage of capitals in a word to be right when one of the following cases holds:
All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital if it has more than one letter, like "Google".
Otherwise, we define that this word doesn't use capitals in a right way.

Example 1:
Input: "USA"
Output: True

Example 2:
Input: "FlaG"
Output: False

Note: The input will be a non-empty word consisting of uppercase and lowercase latin letters.
*/

class Solution {
    public boolean detectCapitalUse(String word) {
        
        int headCapital = 0;
        boolean isCapital = true;
        boolean lastCapital = true;
        int[] asciiArray = new int[word.length()];
        int i = 0;
        for(char c : word.toCharArray()){
            int ascii = (int)c;
            asciiArray[i] = ascii;
            i++;
        }
        
        if(asciiArray[0]<=90 && asciiArray[0]>=65){
            headCapital = 1;
        }
        else if(asciiArray[0]<=122 && asciiArray[0]>=97){
            headCapital = -1;
        }
        
        
        for(i=1; i<asciiArray.length; i++){
            if(asciiArray[i] <= 90 && asciiArray[i] >= 65){
                if(headCapital == 1){
                    headCapital = 0;
                    lastCapital = true;
                }
                else if(headCapital == -1){
                    headCapital = 0;
                    return false;
                }
                else if(headCapital == 0){
                    if(!lastCapital){
                        return false;
                    }
                    else if(lastCapital){
                        lastCapital = true;
                    }
                }
            }
            else if(asciiArray[i] <= 122 && asciiArray[i] >= 97){
                if(headCapital == 1){
                    headCapital = 0;
                    lastCapital = false;
                }
                else if(headCapital == -1){
                    headCapital = 0;
                    lastCapital = false;
                }
                else if(headCapital == 0){
                    if(!lastCapital){
                        lastCapital = false;
                    }
                    else if(lastCapital){
                        return false;
                    }
                }
            }
        }
        
        return true;
    }
}
