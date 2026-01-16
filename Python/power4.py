# https://leetcode.com/problems/power-of-four/description/

class Solution:
    def power4(self, n: int) -> bool:
        return n > 0 and (n & (n - 1)) == 0 and (n & 0x55555555) != 0
    
if __name__ == "__main__":
    sol = Solution()
    test_values = [1, 4, 16, 5, 0, -4, 64, 100]
    for val in test_values:
        print(f"Is {val} a power of 4? {sol.power4(val)}")