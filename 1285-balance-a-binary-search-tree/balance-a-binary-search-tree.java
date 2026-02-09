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
    ArrayList<Integer> inorder = new ArrayList<>();
    void inOrder(TreeNode node){
        if(node == null) return;
        inOrder(node.left);
        inorder.add(node.val);
        inOrder(node.right);
    }
    public TreeNode balancedTree(int left, int right){
        if(left > right) return null;
        int mid = left + (right - left) / 2;
        TreeNode node = new TreeNode(inorder.get(mid));
        node.left = balancedTree(left, mid - 1);
        node.right = balancedTree(mid + 1, right);
        return node;
    }
    public TreeNode balanceBST(TreeNode root) {
        if(root == null) return null;
        inOrder(root);

        return balancedTree(0, inorder.size() - 1);
    }
}