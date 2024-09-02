/**
 * Definition for polynomial singly-linked list.
 * class PolyNode {
 *     int coefficient, power;
 *     PolyNode next = null;
 
 *     PolyNode() {}
 *     PolyNode(int x, int y) { this.coefficient = x; this.power = y; }
 *     PolyNode(int x, int y, PolyNode next) { this.coefficient = x; this.power = y; this.next = next; }
 * }
 */

class Solution {
    public PolyNode addPoly(PolyNode poly1, PolyNode poly2) {
        PolyNode head = new PolyNode();
        PolyNode ans = head; 
        while(poly1 != null && poly2 != null){
            // PolyNode next = head.next
            // System.out.println(head.coefficient + " " + head.power);
            if(poly1.power == poly2.power) {
                if(poly1.coefficient + poly2.coefficient != 0){
                    head.next = new PolyNode(poly1.coefficient + poly2.coefficient, poly1.power);
                    head = head.next;
                } 
                poly1 = poly1.next;
                poly2 = poly2.next;
                // System.out.println(head.coefficient + " " + head.power);
            } else if(poly1.power > poly2.power) {
                head.next = new PolyNode(poly1.coefficient, poly1.power);
                poly1 = poly1.next;
                // System.out.println(head.coefficient + " " + head.power);
                head = head.next;
            } else {
                head.next = new PolyNode(poly2.coefficient, poly2.power);
                poly2 = poly2.next;
                // System.out.println(head.coefficient + " " + head.power);
                head = head.next;
            }

        }

        if(poly1 != null) head.next = poly1;
        if(poly2 != null) head.next = poly2;

        return ans.next;
    }
}