/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        List<Integer> diff = new ArrayList<Integer>();
        for(int i=0; i<nums.length; i++){
            diff.add(target-nums[i]);
        }
        System.out.println(diff.toString());
        for(int i=0; i<nums.length; i++){
            if(diff.contains(nums[i]) && i!=diff.indexOf(nums[i])){
                result[0] = i;
                result[1] = diff.indexOf(nums[i]);
                break;
            }
        }
        return result;
    }
}
