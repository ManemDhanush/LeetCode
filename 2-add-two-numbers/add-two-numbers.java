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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(-1);
        ListNode curr = ans;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0){
            int val = carry;
            if(l1 != null){
                val+=l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                val+=l2.val;
                l2 = l2.next;
            }
            if(val <= 9){
                carry = 0;
                curr.next = new ListNode(val);
                curr = curr.next;
            } else {
                carry = 1;
                curr.next = new ListNode(val%10);
                curr = curr.next;
            }
        }
        return ans.next;
    }
}