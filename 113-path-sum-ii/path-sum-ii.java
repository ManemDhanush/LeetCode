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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        search(root, 0, targetSum, new ArrayList<>(), ans);
        return ans; 
    }

    void search(TreeNode node, int sum, int targetSum, List<Integer> list, List<List<Integer>> ans){
        if(node == null) return;
        sum += node.val;
        list.add(node.val);
        if(sum == targetSum && node.left == node.right){
            ans.add(list);
            return;
        }
        search(node.left, sum, targetSum, new ArrayList(list), ans);
        search(node.right, sum, targetSum, new ArrayList(list), ans);
    }
}