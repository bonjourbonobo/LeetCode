/*
Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".
*/

// Solution 1: Time Limit Exceeded
class Solution {
    public String reverseString(String s) {
        String result = "";
        for(char c : s.toCharArray()){
            result = c + result;
        }
        return result;
    }
}

// Solution 2
class Solution {
    public String reverseString(String s) {
        char[] result = s.toCharArray();
        int head = 0;
        int tail = result.length-1; 
        while(head<tail){
            char tmp = result[head];
            result[head] = result[tail];
            result[tail] = tmp;
            head++;
            tail--;
        }
        return new String(result);
    }
}
