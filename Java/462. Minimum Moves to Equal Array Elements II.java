/*
Given a non-empty integer array, find the minimum number of moves required to make all array elements equal, where a move is incrementing a selected element by 1 or decrementing a selected element by 1.
You may assume the array's length is at most 10,000.

Example:
Input:
[1,2,3]
Output:
2
Explanation:
Only two moves are needed (remember each move increments or decrements one element):
[1,2,3]  =>  [2,2,3]  =>  [2,2,2]
*/

class Solution {
    public int minMoves2(int[] nums) {
        //按照大小排序過後，頭尾的差，也就是兩者要變的總和(要改變的範圍一定在頭尾差的區間內)
        Arrays.sort(nums);
        int total = 0;
        int head = 0;
        int tail = nums.length-1;
        while(head < tail){
            total += (nums[tail] - nums[head]);
            head++;
            tail--;
        }
        return total;
    }
}
