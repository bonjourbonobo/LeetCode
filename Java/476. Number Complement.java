/*
Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.

Note:
The given integer is guaranteed to fit within the range of a 32-bit signed integer.
You could assume no leading zero bit in the integer’s binary representation.

Example 1:
Input: 5
Output: 2
Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.

Example 2:
Input: 1
Output: 0
Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0. So you need to output 0.
*/

/*
Input: 2147483647
Expected: 0
*/

//Solution 1: wrong answer with max 32-bit signed integer
class Solution {
    public int findComplement(int num) {
        int result = 0;
        int mask = 0;
        int count = 0;
        int n = num;
        while(n>0){
            count++;
            n /= 2; 
        }
        mask = (int)Math.pow(2, count)-1;
        result = num^mask;
        return result;
    }
}

// Solution 2
class Solution {
    public int findComplement(int num) {
        int result = 0;
        int mask = (Integer.highestOneBit(num)<<1)-1;
        result = num^mask;
        return result;
    }
}
