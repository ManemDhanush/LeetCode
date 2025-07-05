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
    boolean hasAns = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        search(root, 0, targetSum);
        return hasAns;
    }

    void search(TreeNode root, int sum, int targetSum){
        if(hasAns) return;
        if(root == null) return;
        if(sum + root.val == targetSum && root.left == root.right){
            hasAns = true;
            return;
        }
        search(root.left, sum + root.val, targetSum);
        search(root.right, sum + root.val, targetSum);
    }
}