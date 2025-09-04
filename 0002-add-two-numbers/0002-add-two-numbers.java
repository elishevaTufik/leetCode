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

        int nextNum=0;
        ListNode newList = new ListNode(0);
        ListNode tail=newList;

        while(l1!=null && l2!=null){
            int num=l1.val+l2.val+nextNum;
            tail.next=new ListNode(num%10);
            nextNum=num/10;
            
            l1=l1.next;
            l2=l2.next;
            tail=tail.next;

        }

       if(l1!=null){
            while(l1!=null){
                int num = l1.val + nextNum;
                tail.next = new ListNode(num % 10);
                tail = tail.next;
                nextNum = num / 10;
                l1 = l1.next;
            }
        }

        if(l2!=null){
            while(l2!=null){
                int num = l2.val + nextNum;
                tail.next = new ListNode(num % 10);
                tail = tail.next;
                nextNum = num / 10;
                l2 = l2.next;
            }
        }
        if(nextNum > 0){
            tail.next = new ListNode(nextNum);
        }

        return newList.next;
    }
}