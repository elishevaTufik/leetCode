class Solution(object):
    def myAtoi(self, s):
        """
        :type s: str
        :rtype: int
        """
        s = s.lstrip()
        
        if not s:
            return 0
        
        sign = 1

        if s[0] == '-':
            sign = -1
            s = s[1:]
        elif s[0] == '+':
            s = s[1:]

        res = 0
        INT_MIN = -2147483648
        INT_MAX = 2147483647

        for c in s:
            if c.isdigit():
                res = res * 10 + int(c)
                
                if res * sign < INT_MIN:
                    return INT_MIN
                if res * sign > INT_MAX:
                    return INT_MAX
            else:
                break

        return sign * res
