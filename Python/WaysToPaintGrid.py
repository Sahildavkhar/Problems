# https://leetcode.com/problems/number-of-ways-to-paint-n-3-grid/description/?envType=daily-question&envId=2026-01-03

class Solution:
    def numOfWays(self, n: int) -> int:
        MOD = 10 ** 9 + 7
        A = B = 6

        for _ in range(2, n + 1):
            A, B = (2 * A + 2 * B) % MOD, (2 * A + 3 * B) % MOD

        return (A + B) % MOD
    
if __name__ == "__main__":
    solution = Solution()
    n = 3
    result = solution.numOfWays(n)
    print(result)