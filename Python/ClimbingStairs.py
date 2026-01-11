# https://leetcode.com/problems/climbing-stairs/description/

class solution:
    def climbStairs(self, n: int) -> int:
        if n <= 3:
            return n
        
        prev1 = 3
        prev2 = 2
        cur = 0

        for _ in range(3, n):
            cur = prev1 + prev2
            prev2 = prev1
            prev1 = cur

        return cur
    
    if __name__ == "__main__":
        n = 5
        print(solution().climbStairs(n))