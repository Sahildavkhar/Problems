import math

def getTotalX(a, b):
    ans = 0
    for x in range(1, 101):
        if all(x % i == 0 for i in a) and all(i % x == 0 for i in b):
            ans += 1
    return ans

if __name__ == "__main__":
    n, m = map(int, input().split())
    a = list(map(int, input().split()))
    b = list(map(int, input().split()))
    result = getTotalX(a, b)
    print(result)