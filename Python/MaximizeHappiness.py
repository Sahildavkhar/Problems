# https://leetcode.com/problems/maximize-happiness-of-selected-children/description/?envType=daily-question&envId=2025-12-25

from typing import List
import heapq

class Solution:
    def maximumHappinessSum(self, happiness: List[int], k: int) -> int:
        max_heap = [-h for h in happiness]
        heapq.heapify(max_heap)

        total_happiness_sum = 0
        turns = 0

        for i in range(k):
            total_happiness_sum += max(-heapq.heappop(max_heap) - turns, 0)
            turns += 1

        return total_happiness_sum
    
if __name__ == "__main__":
    import heapq
    from typing import List

    happiness = [5, 3, 8, 6]
    k = 3
    solution = Solution()
    result = solution.maximumHappinessSum(happiness, k)
    print("Maximum Happiness Sum:", result)