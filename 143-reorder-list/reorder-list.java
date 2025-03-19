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
    public void reorderList(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode curr = slow.next;
        slow.next = null;
        ListNode prev = null;

        while(curr != null) {
            // curr = slow.next;
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        slow = prev;
        fast = head;
        while(slow != null){
            ListNode nextFast = fast.next;
            ListNode nextSlow = slow.next;
            fast.next = slow;
            slow.next = nextFast;
            slow = nextSlow;
            fast = nextFast;
        }
    }
}