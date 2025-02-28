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
    public ListNode swapPairs(ListNode head) {

        if(head == null) return head;
        if(head.next == null) return head;
        
        ListNode curr = head;
        ListNode next = head.next;
        head = next;

        while(curr!= null && curr.next!= null){
            ListNode next1 = next.next;

            next.next = curr;
            curr.next = (next1 != null && next1.next != null) ? next1.next : next1;

            // if(next1 == null || next1.next == null) return head;

            curr = next1;
            if (curr != null) next = curr.next;
        }
        
        return head;
    }
}