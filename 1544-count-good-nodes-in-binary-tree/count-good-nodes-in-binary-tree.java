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
    int ans = 0;
    public int goodNodes(TreeNode root) {
        dfs(root, Integer.MIN_VALUE);
        return ans;
    }

    public void dfs(TreeNode root, int max) {
        if(root == null) return;
        if(root.val >= max) ans++;
        dfs(root.left, Math.max(max, root.val));
        dfs(root.right, Math.max(max, root.val));
    }
}