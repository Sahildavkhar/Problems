# https://www.hackerrank.com/challenges/counting-valleys/problem?isFullScreen=true

class Solution:
    def countingValleys(self, steps: int, path: str) -> int:
        level = 0
        valleys = 0
        for step in path:
            if step == 'U':
                level += 1
                if level == 0:
                    valleys += 1
            else:
                level -= 1
        return valleys
    
if __name__ == "__main__":
    sol = Solution()
    path = "UDDDUDUU"
    steps = len(path)
    result = sol.countingValleys(steps, path)
    print(f"Number of valleys: {result}")