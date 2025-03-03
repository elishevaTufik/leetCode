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
            return head; // No need to reorder if there's 0 or 1 node
        }

        ListNode odd = head; // Points to the first node (odd)
        ListNode even = head.next; // Points to the second node (even)
        ListNode evenHead = even; // Store the head of the even list

        while (even != null && even.next != null) {
            odd.next = even.next; // Link current odd to the next odd node
            odd = odd.next; // Move odd pointer

            even.next = odd.next; // Link current even to the next even node
            even = even.next; // Move even pointer
        }

        odd.next = evenHead; // Connect the odd list with the even list

        return head;
    }

    // Helper function to print the linked list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}