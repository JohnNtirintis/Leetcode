class Solution:
    def isPalindrome(self, x: int) -> bool:
        str_x = str(x)
        reversed_x = str_x[::-1]

        if str_x[0] == '-':
            return False

        for index, char in enumerate(str_x):
            if char != reversed_x[index]:
                return False
        return True