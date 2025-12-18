# https://leetcode.com/problems/rearrange-array-elements-by-sign/description/

class Solution:
    def rearrangeArray(self, nums: List[int]) -> List[int]:
        n = len(nums)
        ans = [0] * n

        pos = 0
        neg = 1

        for i in range(n):
            if nums[i] > 0:
                ans[pos] = nums[i]
                pos += 2
            else:
                ans[neg] = nums[i]
                neg += 2
        
        return ans
    
if __name__ == "__main__":
    from typing import List
    size = int(input())
    nums = [int(t) for t in input().strip().split()]
    sol = Solution()
    ans = sol.rearrangeArray(nums)
    print(" ".join(map(str, ans)))