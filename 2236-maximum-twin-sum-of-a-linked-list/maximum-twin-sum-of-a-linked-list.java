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

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        fast = slow.next;
        ListNode prevFast = fast;
        slow.next = null;

        while(fast != null){
            fast = fast.next;
            prevFast.next = slow;
            slow = prevFast;
            prevFast = fast;
        }

        while(slow != null){
            max = Math.max(slow.val + head.val, max);
            slow = slow.next;
            head = head.next;
        }

        return max;
    }
}