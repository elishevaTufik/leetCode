import itertools

class Solution(object):
    def letterCombinations(self, digits):
        if not digits:
            return []

        mapping = {
            '2': 'abc', '3': 'def', '4': 'ghi', '5': 'jkl',
            '6': 'mno', '7': 'pqrs', '8': 'tuv', '9': 'wxyz'
        }

        letters = [mapping[d] for d in digits]
        combos = itertools.product(*letters)
        return [''.join(c) for c in combos]


# דוגמה:
sol = Solution()
print(sol.letterCombinations("23"))
