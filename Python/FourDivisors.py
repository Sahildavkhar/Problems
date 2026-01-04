# https://leetcode.com/problems/sum-of-four-divisors/description/?envType=daily-question&envId=2024-06-11

from typing import List

class solution:
    def sumFourDivisors(self, nums: List[int]) -> int:
        res = 0
        for n in nums:
            val = self.sumOne(n)
            if val != -1:
                res += val
        return res

    def sumOne(self, n: int) -> int:
        p = round(n ** (1 / 3))
        if p ** 3 == n and self.isPrime(p):
            return 1 + p + p * p + p * p * p

        for i in range(2, int(n ** 0.5) + 1):
            if n % i == 0:
                a, b = i, n // i
                if a != b and self.isPrime(a) and self.isPrime(b):
                    return 1 + a + b + n
                return -1
        return -1

    def isPrime(self, x : int) -> bool:
        if x < 2:
            return False
        for i in range(2, int(x ** 0.5) + 1):
            if x % i == 0:
                return False
        return True
    
    if __name__ == "__main__":
        nums = list(map(int, input().strip().split()))
        solution = solution()
        result = solution.sumFourDivisors(nums)
        print(result)