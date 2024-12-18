class Solution(object):
    def moveZeroes(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        count=0
        ind=0
        for i,num in enumerate(nums):
            if num==0:
                count+=1
            else:
                nums[ind]=num
                ind+=1
        for j in range(ind,len(nums)):
            nums[j]=0
            
        