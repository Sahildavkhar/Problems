# https://www.hackerrank.com/challenges/sock-merchant/problem

class solution:
    def sockMerchant(n, ar):
        reult = 0
        map = {}
        
        for color in ar:
            map[color] = map.get(color, 0) + 1
            
        for value in map.values():
            result += value // 2
            
        return result
    
    if __name__ == "__main__":
        n = int(input().strip())
        ar = list(map(int, input().strip().split()))
        result = solution.sockMerchant(n, ar)
        print(result)