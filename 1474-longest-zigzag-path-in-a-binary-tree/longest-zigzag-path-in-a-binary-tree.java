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
    int count = 0;
    public void dfs(TreeNode n, int max, boolean left){
        if(n == null) return;
        count = Math.max(count, max);
        if(left){
            dfs(n.right, max + 1, false);
            dfs(n.left, 1, true);
        } else {
            dfs(n.left, max + 1, true);
            dfs(n.right, 1, false);
        }
    }
    public int longestZigZag(TreeNode root) {
        // int[] count = new int[1];
        dfs(root, 0, true);
        dfs(root, 0, false);
        return count;
    }
}