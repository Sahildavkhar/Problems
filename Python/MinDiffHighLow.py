# https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/description/?envType=daily-question&envId=2026-01-25

from typing import List

class MinDiffHighLow:
    def minimumDifference(self, nums: List[int], k: int) -> int:
        n = len(nums)
        nums.sort()
        ans = nums[k - 1] + nums[0]
        for i in range(0, n - k + 1):
            ans = min(ans, nums[i + k - 1] - nums[i])
        return ans
    
if __name__ == "__main__":
    solver = MinDiffHighLow()
    nums = [9, 4, 1, 7]
    k = 2
    result = solver.minimumDifference(nums, k)
    print(f"Minimum difference: {result}")