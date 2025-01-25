class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        INT_MIN, INT_MAX = -2**31, 2**31 - 1
        sign = -1 if x < 0 else 1
        reversed_x = int(str(abs(x))[::-1])
        result = sign * reversed_x
        if result < INT_MIN or result > INT_MAX:
            return 0
        return result