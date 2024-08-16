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
    public void dfs(TreeNode n, int max, int[] count, boolean left, boolean right){
        if(n == null) return;
        count[0] = Math.max(count[0], max);
        if(left){
            dfs(n.right, max + 1, count, false, true);
            dfs(n.left, 1, count, true, false);
        } else {
            dfs(n.left, max + 1, count, true, false);
            dfs(n.right, 1, count, false, true);
        }

        // if (isLeft) {
        //     dfs(node.right, length + 1, maxLength, false);
        //     dfs(node.left, 1, maxLength, true);
        // } else {
        //     dfs(node.left, length + 1, maxLength, true);
        //     dfs(node.right, 1, maxLength, false);
        // }
    }
    public int longestZigZag(TreeNode root) {
        int[] count = new int[1];
        dfs(root, 0, count, true, false);
        dfs(root, 0, count, false, true);
        return count[0];
    }
}