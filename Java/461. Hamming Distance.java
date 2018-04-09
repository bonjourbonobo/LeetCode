/*
The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
Given two integers x and y, calculate the Hamming distance.

Note:
0 ≤ x, y < 231.

Example:
Input: x = 1, y = 4
Output: 2
Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑
The above arrows point to positions where the corresponding bits are different.
*/

// Solution 1
class Solution {
    public int hammingDistance(int x, int y) {
        int result = 0;
        int xor = x^y;
        while(xor>0){
            if(xor%2 == 1){
                result++;
            }
            xor /= 2;
        }
        return result;
    }
}

// Solution 2
class Solution {
    public int hammingDistance(int x, int y) {
        int result = 0;
        int xor = x^y;
        while(xor>0){
            result++;
            xor = xor&(xor-1);
        }
        return result;
    }
}

// Solution 3
class Solution {
    public int hammingDistance(int x, int y) {
        int result = 0;
        while(x>0 || y>0){
            if(x%2 != y%2){
                result++;
            }
            x /= 2;
            y /= 2;
        }
        return result;
    }
}
