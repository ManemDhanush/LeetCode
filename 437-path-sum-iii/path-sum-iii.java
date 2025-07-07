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
    int ans = 0;
    public int pathSum(TreeNode root, int targetSum) {
        HashMap<Long, Integer> map = new HashMap<>();
        map.put(0L, 1);
        pathsum(root, 0, targetSum, map);
        return ans;
    }

    void pathsum(TreeNode node, long currSum, long targetSum, HashMap<Long, Integer> map){
        if(node == null) return;
        currSum += node.val;
        if(map.containsKey(currSum - targetSum)){
            ans += map.get(currSum - targetSum);
        }
        map.put(currSum, map.getOrDefault(currSum, 0) + 1);
        pathsum(node.left, currSum, targetSum, map);
        pathsum(node.right, currSum, targetSum, map);
        map.put(currSum, map.get(currSum) - 1);
    }
}