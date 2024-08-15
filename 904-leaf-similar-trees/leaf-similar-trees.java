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

    public void dfs(TreeNode node, List<Integer> ans){
        if(node.left == null && node.right == null){
            ans.add(node.val);
        }

        if(node.left != null) dfs(node.left, ans);
        if(node.right != null) dfs(node.right, ans);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();

        dfs(root1, list1);
        dfs(root2, list2);

        return list1.equals(list2);
    }
}