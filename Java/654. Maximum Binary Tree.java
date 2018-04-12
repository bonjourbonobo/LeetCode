/*
Given an integer array with no duplicates. A maximum tree building on this array is defined as follow:
The root is the maximum number in the array.
The left subtree is the maximum tree constructed from left part subarray divided by the maximum number.
The right subtree is the maximum tree constructed from right part subarray divided by the maximum number.
Construct the maximum tree by the given array and output the root node of this tree.

Example 1:
Input: [3,2,1,6,0,5]
Output: return the tree root node representing the following tree:
      6
    /   \
   3     5
    \    / 
     2  0   
       \
        1
        
Note:
The size of the given array will be in the range [1,1000].
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        
        TreeNode tree = new TreeNode(nums[0]);
        tree.right = null;
        tree.left = null;
        int i = 0;
        while(i+1<nums.length){
            tree = recursive(tree, nums[i+1]);
            i++;
        }
        return tree;
    }
    
    private TreeNode recursive(TreeNode tree, int right) {
          
        if(tree == null){
            //System.out.println("tree == null");
            TreeNode newTree = new TreeNode(right);
            newTree.left = null;
            newTree.right = null;
            return newTree;
        }
        int root = tree.val;
        if(root < right){
            //System.out.println("root < right");
            TreeNode newTree = new TreeNode(right);
            newTree.left = tree;
            //newTree.right = null;
            return newTree;
        }
        else if(root > right){
            //System.out.println("root > right");
            tree.right = recursive(tree.right, right);
            return tree;
        }
        return null;
    }
}
