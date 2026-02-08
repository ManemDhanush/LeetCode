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
    HashMap<TreeNode, Integer> map = new HashMap<>();
    int height(TreeNode root){
        if (root == null)
            return 0;

        if (map.containsKey(root))
            return map.get(root);

        map.put(root, Math.max(height(root.left), height(root.right)) + 1);
        return map.get(root);
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        if (Math.abs(height(root.left) - height(root.right)) > 1){
            return false;
        } else{
            return isBalanced(root.left) && isBalanced(root.right);
        }
    }
}