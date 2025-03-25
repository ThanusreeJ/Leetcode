class Solution:
    def longestPalindrome(self, s: str) -> str:
        for length in range(len(s), 0, -1):
            for i in range(len(s) - length + 1):
                substring = s[i:i + length]
                if substring == substring[::-1]:
                    return substring
        return ""