// https://leetcode.com/problems/reverse-linked-list

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        // return head if null, base condition
        if(head == NULL){
            return head;
        }

        // create a new listnode with the head value and move head to next 
        ListNode* ans = new ListNode(head->val);
        head = head->next;

        // create a new ListNode with the next head value and the previous location of the ans
        while(head != NULL){
            ans = new ListNode(head->val, ans);
            head = head->next;
        } 

        return ans;
    }
};