/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    List<TreeNode> pPath = new ArrayList<TreeNode>();
    List<TreeNode> qPath = new ArrayList<TreeNode>();
    List<TreeNode> path = new ArrayList<TreeNode>();
    public void dfs(TreeNode n, TreeNode p, TreeNode q){
        if(n == null || (!pPath.isEmpty() && !qPath.isEmpty())) return;
        path.add(n);
        if(n.val == p.val) pPath = new ArrayList<TreeNode>(path);
        if(n.val == q.val) qPath = new ArrayList<TreeNode>(path);
        dfs(n.left, p, q);
        dfs(n.right, p, q);
        path.remove(n);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root, p, q);
        int size = pPath.size() > qPath.size() ? qPath.size() : pPath.size();
        int i = 0;
        for(i = 0; i < size; i++){
            if(pPath.get(i) != qPath.get(i)) break;
        }

        return pPath.get(i - 1);
    }
}