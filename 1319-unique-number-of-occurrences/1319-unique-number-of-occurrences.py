class Solution(object):
    def uniqueOccurrences(self, arr):
        """
        :type arr: List[int]
        :rtype: bool
        """
        my_dict = {}
        for item in arr:
            if my_dict.get(item,-1)==-1:
                my_dict[item]=1
            else:
                my_dict[item]+=1
        
        values = list(my_dict.values())
        if len(values) != len(set(values)):
            return False
        else:
            return True
