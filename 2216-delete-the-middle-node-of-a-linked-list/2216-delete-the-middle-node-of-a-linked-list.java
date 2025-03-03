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
    
     public static ListNode deleteMiddle(ListNode head) {
        // Edge case: If the list has only one node, return null
        if (head == null || head.next == null) {
            return null;
        }

        // Use slow and fast pointers to find the middle node
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            prev = slow; // Store the previous node
            slow = slow.next;
            fast = fast.next.next;
        }

        // Delete the middle node
        if (prev != null) {
            prev.next = slow.next;
        }

        return head;
    }
}