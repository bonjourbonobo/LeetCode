/*
Implement strStr().
Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:
Input: haystack = "hello", needle = "ll"
Output: 2

Example 2:
Input: haystack = "aaaaa", needle = "bba"
Output: -1
*/

class Solution {
    public int strStr(String haystack, String needle) {
        //Searching for an empty string always yields true.
        if(needle.isEmpty()){ 
            return 0;
        }
        for(int i=0; i<haystack.length(); i++){
            for(int j=0; j<needle.length(); j++){
                if(i+j >= haystack.length()){
                    return -1;
                }
                if(haystack.charAt(i+j) != needle.charAt(j)){
                    break;
                }
                else{
                    if(j == needle.length()-1){
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}
