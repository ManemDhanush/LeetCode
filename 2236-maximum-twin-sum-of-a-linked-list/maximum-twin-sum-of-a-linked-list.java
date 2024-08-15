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
class Solution {
    public int pairSum(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;
        int max = Integer.MIN_VALUE;

        Stack<Integer> stack = new Stack<>();

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            stack.add(slow.val);
            slow = slow.next;
        }

        while(slow != null){
            max = Math.max(slow.val + stack.pop(), max);
            slow = slow.next;
        }

        return max;
    }
}