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
    public boolean isUnivalTree(TreeNode root) {
        
        if(root!=null){
            return checkVal(root.right, root.val) && checkVal(root.left, root.val);
        }
        else{
            return true;
        }
        
    }
    
    private boolean checkVal(TreeNode root, int parentVal){
        if(root == null){
            return true;
        }
        else{
            if(root.val == parentVal){
                return checkVal(root.right, root.val) && checkVal(root.left,root.val);
            }
            else{
                return false;
            }
        }
    }
}
