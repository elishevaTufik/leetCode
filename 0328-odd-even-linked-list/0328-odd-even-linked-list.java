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
     public static ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head; 
        }

        ListNode odd = head; 
        ListNode even = head.next; 
        ListNode evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even.next; 
            odd = odd.next;

            even.next = odd.next; 
            even = even.next; 
        }

        odd.next = evenHead; 

        return head;
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}