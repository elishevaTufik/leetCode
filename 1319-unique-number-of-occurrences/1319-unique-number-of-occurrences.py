class Solution(object):
    def uniqueOccurrences(self, arr):
        """
        :type arr: List[int]
        :rtype: bool
        """
        my_dict = dict()

        for item in arr:
            if item in my_dict:
                my_dict[item]+=1
            else:
                my_dict[item]=1

        values = my_dict.values()

        has_duplicates = len(values) != len(set(values))
        return(not has_duplicates)
            