class Solution(object):
    def maxVowels(self,s, k):
        """
        :type s: str
        :type k: int
        :rtype: int
        """
        currentCount=0

        for i in range(0,k):
            if s[i] in "aeiouAEIOU":
                currentCount+=1

        maxCount=currentCount

        for i in range(k,len(s)):

            if s[i] in "aeiouAEIOU":
                    currentCount+=1 

            if s[i-k] in "aeiouAEIOU":
                currentCount-=1

            maxCount=max(maxCount,currentCount)

            if currentCount==k:
                return currentCount

        return maxCount    
