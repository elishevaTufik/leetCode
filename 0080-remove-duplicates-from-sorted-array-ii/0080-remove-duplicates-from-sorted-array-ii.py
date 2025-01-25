class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        k=2

        for i in range(2,len(nums)):
            if nums[i]==nums[k-1] and nums[i]==nums[k-2] :
                continue
            nums[k]=nums[i]
            k+=1
            
        return k