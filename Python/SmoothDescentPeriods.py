# https://leetcode.com/problems/number-of-smooth-descent-periods-of-a-stock/?envType=daily-question&envId=2025-12-15

from typing import List

class Solution:
    def getDescentPeriods(self, prices: List[int]) -> int:
        n = len(prices)
        res = 1
        prev = 1

        for i in range(1, n):
            if prices[i] == prices[i - 1] - 1:
                prev += 1
            else:
                prev = 1
            res += prev
        return res
    
if __name__ == "__main__":
    prices = list(map(int, input().split()))
    solution = Solution()
    result = solution.getDescentPeriods(prices)
    print(result)
