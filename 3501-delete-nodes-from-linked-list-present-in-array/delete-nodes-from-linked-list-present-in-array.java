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
    public ListNode modifiedList(int[] nums, ListNode head) {
        // ListNode prev = head;
        // String compare = Arrays.stream(nums).mapToObj(String::valueOf).map((x) ->"+" + x+"+").collect(Collectors.joining());

        Set<Integer> set = new HashSet<>();

        for(int n: nums){
            set.add(n);
        }

        while(head != null && set.contains(head.val)){
            // System.out.println(curr.val);
            head = head.next;
        }
        ListNode curr = head;
        // prev = head;
        // head = curr;
        while(curr.next !=null){
            // curr = curr.next;
            // System.out.println(curr.val);
            if(set.contains(curr.next.val)){
                // prev.next = curr;
                // curr = curr.next;
                // prev = prev.next;
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        // if(curr == null) return head;
        // if(compare.contains(curr.val + "+")) prev.next = null;
        return head;
    }
}