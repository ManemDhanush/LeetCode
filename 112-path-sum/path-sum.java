/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return search(root, 0, targetSum);
    }

    boolean search(TreeNode root, int sum, int targetSum){
        if(root == null) return false;
        if(sum + root.val == targetSum && root.left == root.right){
            return true;
        }
        return search(root.left, sum + root.val, targetSum) || search(root.right, sum + root.val, targetSum);
    }
}