class Solution(object):
    def maxOperations(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        count = 0
        hash_table = {}

        for num in nums:
            if hash_table.get(k - num, 0) > 0:
                count += 1
                hash_table[k - num] -= 1
            else:
                if num in hash_table:
                    hash_table[num] += 1
                else:
                    hash_table[num] = 1

        return count     
           
