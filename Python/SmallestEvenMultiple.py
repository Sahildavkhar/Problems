# https://leetcode.com/problems/smallest-even-multiple/description/

class solution:
    def smallestEvenMultiple(n):
        if n % 2 == 0:
            return n
        return n * 2
    
    if __name__ == "__main__":
        n = 5
        print(smallestEvenMultiple(n))