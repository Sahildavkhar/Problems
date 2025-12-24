# https://www.hackerrank.com/challenges/divisible-sum-pairs/problem?isFullScreen=true

class solution:
    def divisbleSumPairs(n, k, ar):
        sum = 0
        count = 0
        
        for i in range(0, n):
            for j in range(i + 1, n):
                sum = ar[i] + ar[j]
                if sum % k == 0:
                    count += 1
        
        return count
    
if __name__ == "__main__":
    n = 6
    k = 3
    ar = [1, 3, 2, 6, 1, 2]
    result = solution.divisbleSumPairs(n, k, ar)
    print("Number of divisible sum pairs:", result)
    
        