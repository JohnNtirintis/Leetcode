class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        letters = {}
        
        for letter in s:
            letters[letter] = letters.get(letter, 0) + 1

        for letter in t:
            letters[letter] = letters.get(letter, 0) - 1
            if letters[letter] < 0:
                return letter