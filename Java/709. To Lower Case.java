/*
Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.

Example 1:
Input: "Hello"
Output: "hello"

Example 2:
Input: "here"
Output: "here"

Example 3:
Input: "LOVELY"
Output: "lovely"
*/

class Solution {
    public String toLowerCase(String str) {
        int[] asciis = new int[str.length()];
        StringBuilder result = new StringBuilder();
        for(char c : str.toCharArray()){
            int ascii = (int)c;
            if(ascii >= 65 && ascii <= 90){
                char lowerChar = (char) (ascii+32);
                result.append(lowerChar);
            }
            else{
                result.append(c);
            }
        }
        return result.toString();
    }
}


