# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def pairSum(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: int
        """
        slow = fast = head
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next

        # 2. Reverse second half in-place
        prev = None
        curr = slow
        while curr:
            nxt = curr.next
            curr.next = prev
            prev = curr
            curr = nxt
        # prev now points to head of reversed second half

        # 3. Walk first half and reversed second half
        max_sum = 0
        p1, p2 = head, prev
        while p2:  # second half may be shorter/equal
            max_sum = max(max_sum, p1.val + p2.val)
            p1 = p1.next
            p2 = p2.next

        return max_sum