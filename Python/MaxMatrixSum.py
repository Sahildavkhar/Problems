# https://leetcode.com/problems/maximum-matrix-sum/description/?envType=daily-question&envId=2026-01-05

from typing import List


class solution:
    def maxMatrixSum(self, matrix: List[List[int]]) -> int:
        total_sum = 0
        min_abs_val = float("inf")
        negative_count = 0

        for row in matrix:
            for val in row:
                total_sum += abs(val)
                if val < 0:
                    negative_count += 1
                min_abs_val = min(min_abs_val, abs(val))

        if negative_count % 2 != 0:
            total_sum -= 2 * min_abs_val

        return total_sum
    
    if __name__ == "__main__":
        matrix = [[-1, -2, -3], [-4, 5, 6], [7, 8, 9]]
        print(solution().maxMatrixSum(matrix))  # Output: 45from typing import List