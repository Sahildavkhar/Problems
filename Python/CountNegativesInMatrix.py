# https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/description/?envType=daily-question&envId=2025-12-28

from typing import List

class Solution:
    def countNegatives(self, grid: List[List[int]]) -> int:
        n = len(grid)
        m = len(grid[0])
        i = 0
        j = m - 1
        count = 0

        while(i < n and j >= 0):
            if(grid[i][j] < 0):
                count += n - i
                j -= 1
            else:
                i += 1
        
        return count
    
if __name__ == "__main__":
    solution = Solution()
    grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
    print("Answer is",solution.countNegatives(grid))