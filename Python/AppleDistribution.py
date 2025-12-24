# https://leetcode.com/problems/apple-redistribution-into-boxes/description/?envType=daily-question&envId=2025-12-24

from typing import List

class Solution:
    def minimumBoxes(self, apple: List[int], capacity: List[int]) -> int:
        totalApples = sum(apple)

        capacity.sort(reverse = True)

        count = 0
        for i in capacity:
            totalApples -= i
            count += 1
            if totalApples <= 0:
                break
        
        return count
    
if __name__ == "__main__":
    solution = Solution()
    apple = [10, 20, 30]
    capacity = [15, 25, 10, 5]
    result = solution.minimumBoxes(apple, capacity)
    print("Minimum boxes needed:", result)  # Expected output: 3