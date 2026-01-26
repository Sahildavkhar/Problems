# https://leetcode.com/problems/minimum-absolute-difference/description/?envType=daily-question&envId=2026-01-26

from typing import List

class MinAbsDiff:
    def minimumAbsDifference(self, A: List[int]) -> List[List[int]]:
        A.sort()
        n = len(A)
        minDiff = 2e6 + 1
        res = []

        for i in range(1, n):
            diff = A[i] - A[i - 1]
            if diff < minDiff:
                minDiff = diff
                res = [[A[i - 1], A[i]]]
            elif diff == minDiff:
                res.append([A[i - 1], A[i]])
        
        return res
    
if __name__ == "__main__":
    solver = MinAbsDiff()
    A = [4, 2, 1, 3]
    result = solver.minimumAbsDifference(A)
    print(f"Minimum absolute difference pairs: {result}")