class Solution:
    def romanToInt(self, s: str) -> int:
        roman_dict = {
            'I':1, 'V':5, 'X':10, 'L':50,
            'C':100, 'D':500, 'M':1000
        }
        currentNum = 0

        for index, char in enumerate(s):
            if index + 1 < len(s) and roman_dict[char] < roman_dict[s[index + 1]]:
                currentNum -= roman_dict[char]
            else:
                currentNum += roman_dict[char]
        return currentNum