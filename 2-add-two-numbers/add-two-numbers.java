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
        int carry = 0;
        ListNode ans = new ListNode(-1);
        ListNode curr = ans;

        while(l1 != null || l2 != null){
            int num = carry;
            if(l1 != null){
                num += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                num += l2.val;
                l2 = l2.next;
            }
            curr.next = new ListNode(num % 10);
            curr = curr.next;
            carry = num / 10;
        }

        if(carry > 0){
            curr.next = new ListNode(carry);
        }

        return ans.next;
    }
}