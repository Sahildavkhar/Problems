# https://leetcode.com/problems/two-best-non-overlapping-events/description/?envType=daily-question&envId=2025-12-23

from git import List
import heapq

class Solution:
    def maxTwoEvents(self, events: List[List[int]]) -> int:
        pq = []

        events.sort(key = lambda x:x[0])

        maxVal = 0
        maxSum = 0

        for event in events:
            while pq and pq[0][0] < event[0]:
                maxVal = max(maxVal, pq[0][1])
                heapq.heappop(pq)

            maxSum = max(maxSum, maxVal + event[2])
            heapq.heappush(pq, (event[1], event[2]))
        
        return maxSum
    
if __name__ == "__main__":
    solution = Solution()
    events = [[1,3,2],[4,5,2],[2,4,3]]
    result = solution.maxTwoEvents(events)
    print("The maximum sum of two non-overlapping events:", result)  # Expected output: 4