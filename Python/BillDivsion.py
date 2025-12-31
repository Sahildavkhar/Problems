# https://www.hackerrank.com/challenges/bon-appetit/problem?isFullScreen=true

class solution:
    def bonAppetit(bill, k, b):
        anna = (sum(bill) - bill[k]) / 2
        print("Bon Appetit" if anna == b else b - anna)
    
    if __name__ == "__main__":
        n, k = map(int, input().split())
        bill = list(map(int, input().split()))
        b = int(input())
        bonAppetit(bill, k, b)
        