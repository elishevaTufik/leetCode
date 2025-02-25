class Solution(object):
    def maxScore(self, nums1, nums2, k):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :type k: int
        :rtype: int
        """
        pairs = sorted(zip(nums2, nums1), key=lambda x: -x[0])
        
        heap = []     
        total_sum = 0 
        max_score = 0
        
        for n2, n1 in pairs:
            heapq.heappush(heap, n1)
            total_sum += n1
            
            if len(heap) > k:
                total_sum -= heapq.heappop(heap)
            
            if len(heap) == k:
                max_score = max(max_score, total_sum * n2)
        
        return max_score