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

    Deque<TreeNode> list1 = new ArrayDeque<TreeNode>();
    Deque<TreeNode> list2 = new ArrayDeque<TreeNode>();
    List<Integer> ans = new ArrayList<Integer>();

    public List<Integer> rightSideView(TreeNode root) {
        if(root!=null) list1.add(root);
        bfs();
        return ans;
    }

    public void bfs() {
        while(!list1.isEmpty()){
            if(list1.isEmpty()) return;
            TreeNode lastNode = list1.peekLast();
            if (lastNode != null) {
                ans.add(lastNode.val);
            }

            while(!list1.isEmpty()){
                TreeNode node = list1.pollFirst();
                if(node.left != null) list2.addLast(node.left);
                if(node.right != null) list2.addLast(node.right);
            }
            list1.addAll(list2);
            list2.clear();
        }
    }
}