/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    boolean ans;
    public void dfs(List<Integer> path, TreeNode node, List<Integer> str,List<Integer> path1){
        if (path.size() >= str.size()) {
            int start = path.size() - str.size();
            if (path.subList(start, path.size()).equals(str)) {
                ans = true;
                return;
            }
        }
        if(node == null) return;
        path.add(node.val);
        path1.add(node.val);
        // System.out.println(path.toString());
        dfs(path, node.left, str,path1);
        dfs(path, node.right, str,path1);
        // path.deleteCharAt(path.length() - 1);
        path.removeLast();
        // path.deleteCharAt(path.length() - 1);
    }
    public boolean isSubPath(ListNode head, TreeNode root) {
        List<Integer> list = new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head = head.next;
        }
        dfs(new ArrayList<Integer>(), root, list,new ArrayList<Integer>());
        return ans;
    }
}