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

    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<Integer>();
        if (root == null) return ans;

        q.offer(root);

        while(!q.isEmpty()){
            int size = q.size();
            TreeNode right = null;

            for(int i=0; i<size; i++){
                TreeNode node = q.poll();
                if (i == size - 1) {
                    right = node;
                }
                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
            }
            ans.add(right.val);

        }
        return ans;
    }

}