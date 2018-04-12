/*
Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
Find all the elements that appear twice in this array.
Could you do it without extra space and in O(n) runtime?

Example:
Input:
[4,3,2,7,8,2,3,1]
Output:
[2,3]
*/

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        for(int num : nums){
            int i = num;
            if(i<0){
                i = num*(-1);
            }
            
            if(nums[i-1]>0){
                nums[i-1] = nums[i-1] * (-1);
            }
            else{
                result.add(i);
            }

        }
        return result;
        
    }
}
