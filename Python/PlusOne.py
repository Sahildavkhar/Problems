# https://leetcode.com/problems/plus-one/description/?envType=daily-question&envId=2026-01-01

class solution:
    def plusOne(digits):
        for i in range(len(digits) - 1, -1, -1):
            if digits[i] != 9:
                digits[i] += 1
                return digits
            digits[i] = 0
        return [1] + digits
    
    if __name__ == "__main__":
        digits = list(map(int, input().strip().split()))
        result = plusOne(digits)
        print(result)