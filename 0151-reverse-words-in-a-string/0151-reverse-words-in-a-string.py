class Solution(object):
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        listWords=s.split()
        listWords=listWords[::-1]
        sReverse=" ".join(listWords)
        return sReverse
