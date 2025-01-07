class Solution(object):
    def closeStrings(self, word1, word2):
        """
        :type word1: str
        :type word2: str
        :rtype: bool
        """
        if set(word1) != set(word2):
            return False

        # dict1 = {}
        # dict2 = {}

        # for item in word1:
        #     dict1[item]=dict1.get(item,0)+1

        # for item in word2:
        #     dict2[item]=dict2.get(item,0)+1
        dict1 = Counter(word1)
        dict2 = Counter(word2)
        return sorted(dict1.values()) == sorted(dict2.values())

        