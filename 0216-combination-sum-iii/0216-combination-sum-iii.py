from itertools import combinations

class Solution(object):
    def combinationSum3(self, k, n):
        """
        :type k: int
        :type n: int
        :rtype: List[List[int]]
        """
        result = []
        for combo in combinations(range(1, 10), k):
            if sum(combo) == n:
                result.append(list(combo))
        return result    