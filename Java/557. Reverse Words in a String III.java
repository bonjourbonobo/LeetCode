/*
Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:
Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"

Note: In the string, each word is separated by single space and there will not be any extra space in the string.
*/

// Solution 1: too slow
class Solution {
    public String reverseWords(String s) {
        String result = "";
        String term = "";
        for(char c : s.toCharArray()){
            if(c == ' '){
                result += term;
                result += " ";
                term = "";
            }
            else{
                term = c+term;
            }
        }
        result += term;
        return result;
        
    }
}
