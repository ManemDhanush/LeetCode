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

    public void dfs(TreeNode node, int[] max, int height){
        if(node == null) return;

        max[0] = Math.max(max[0], height);
        if(node.left != null) dfs(node.left, max, height+1);
        if(node.right != null) dfs(node.right, max, height+1);
        // height--;
    }

    public int maxDepth(TreeNode root) {
        int[] max = new int[1]; 
        max[0] = 0;
        dfs(root, max, 1);
        return max[0];
    }
}