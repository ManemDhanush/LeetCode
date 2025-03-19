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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> p = new PriorityQueue<>();

        for(ListNode list: lists) {
            while(list!=null){
                p.add(list.val);
                list = list.next;
            }
        }
        if(p.isEmpty()) return null;
        ListNode temp = new ListNode(p.poll());
        ListNode ans = temp;
        while(!p.isEmpty()){
            ListNode t = new ListNode(p.poll());
            temp.next = t;
            temp = temp.next;
        }

        return ans;
    }
}