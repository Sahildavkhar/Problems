# https://www.hackerrank.com/challenges/migratory-birds/problem

class solution:
    def migratoryBirds(arr):
        freq = {}
        maxCount = 0
        minElement = float('inf')
        
        for bird in arr:
            freq[bird] = freq.get(bird, 0) + 1
            
            if freq[bird] > maxCount or (freq[bird] == maxCount and bird < minElement):
                maxCount = freq[bird]
                minElement = bird
            
        return minElement
    
    if __name__ == '__main__':
        arr = [1, 4, 4, 4, 5, 3]
        print("Answer is", migratoryBirds(arr))
