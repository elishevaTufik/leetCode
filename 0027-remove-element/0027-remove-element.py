class Solution(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        c=nums.count(val)
        for _ in range(c):
            nums.remove(val)
            
        return len(nums)