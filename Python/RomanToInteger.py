# https://leetcode.com/problems/roman-to-integer/description/

class Solution:
    def romanToInt(self, s: str) -> int:
        res = 0
        map = {
            'I': 1,
            'V': 5,
            'X': 10,
            'L': 50,
            'C': 100,
            'D': 500,
            'M': 1000
        }

        for a, b in zip(s, s[1:]):
            if map[a] < map[b]:
                res = res - map[a]
            else:
                res = res + map[a]
        
        return res + map[s[-1]]
    
