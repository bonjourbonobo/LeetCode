/*
Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's in their binary representation and return them as an array.

Example:
For num = 5 you should return [0,1,1,2,1,2].

Follow up:
It is very easy to come up with a solution with run time O(n*sizeof(integer)). But can you do it in linear time O(n) /possibly in a single pass?
Space complexity should be O(n).
Can you do it like a boss? Do it without using any builtin function like __builtin_popcount in c++ or in any other language.
*/

class Solution {
    public int[] countBits(int num) {
        int[] result = new int[num+1];
        int[] table = new int[]{0, 1, 1, 2};
        if(num==0){
            result[0] = 0;
            return result;
        }
        for(int i=1; i<=num; i++){
            int sum = 0;
            int remain = i;
            while(remain>0){
                sum += table[remain%4];
                remain = remain/4;
            }
            result[i] = sum;
        }
        return result;
    }
}
