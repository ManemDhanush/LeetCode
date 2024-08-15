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

    public void dfs(TreeNode n, int[] count, int max) {
        if(max <= n.val) count[0]++;
        if(n.left != null) dfs(n.left, count, Math.max(n.val, max));
        if(n.right != null) dfs(n.right, count, Math.max(n.val, max));
    }
    public int goodNodes(TreeNode root) {
        int[] ans = new int[1];
        ans[0] = 0;
        dfs(root, ans, Integer.MIN_VALUE);
        return ans[0];
    }
}