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

    int sum = 0;
    public int sumRootToLeaf(TreeNode root) {
        dfs(root, new StringBuilder());
        return sum;
    }

    void dfs(TreeNode node, StringBuilder sb){
        if(node == null) return;
        sb.append(node.val);
        if(node.left == null && node.right == null){
            sum += Integer.parseInt(sb.toString(), 2);
            // return;
        } else {
            dfs(node.left, sb);
            dfs(node.right, sb);
        }
        sb.deleteCharAt(sb.length() - 1);
    }

}