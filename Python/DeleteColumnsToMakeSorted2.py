# https://leetcode.com/problems/delete-columns-to-make-sorted-ii/description/?envType=daily-question&envId=2025-12-21

class Solution:
    def minDeletionSize(self, strs):
        n = len(strs)
        m = len(strs[0])

        cuts = [False] * (n - 1)
        ans = 0

        for col in range(m):
            valid = True
            for i in range(n - 1):
                if not cuts[i] and strs[i][col] > strs[i+1][col]:
                    valid = False
                    break

            if not valid:
                ans += 1
                continue

            for i in range(n - 1):
                if strs[i][col] < strs[i+1][col]:
                    cuts[i] = True

        return ans
    
