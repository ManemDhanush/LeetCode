/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return head;

        Node temp = head;
        HashMap<Node, Node> map = new HashMap<>();

        while(temp!=null) {
            map.put(temp, new Node(temp.val));
            temp = temp.next;
        }

        temp = head;

        while(temp!=null){
            Node random = temp.random;
            Node next = temp.next;
            Node curr = map.get(temp);

            if(next!=null){
                curr.next = map.get(next);
            }
            if(random!=null){
                curr.random = map.get(random);
            }

            temp = temp.next;
        }

        return map.get(head);

    }
}