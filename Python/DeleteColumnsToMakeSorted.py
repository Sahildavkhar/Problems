# https://leetcode.com/problems/delete-columns-to-make-sorted/description/?envType=daily-question&envId=2025-12-20

class Solution:
    def minDeletionSize(self, strs: List[str]) -> int:
        res = 0

        for col in range(len(strs[0])):
            for row in range(1, len(strs)):
                if(strs[row][col] < strs[row - 1][col]):
                    res += 1
                    break
        
        return res
    
if __name__ == "__main__":
    from typing import List
    size = int(input())
    strs = []
    for _ in range(size):
        strs.append(input().strip())
    sol = Solution()
    ans = sol.minDeletionSize(strs)
    print(ans)