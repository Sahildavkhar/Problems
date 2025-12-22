# https://www.hackerrank.com/challenges/the-birthday-bar/problem?isFullScreen=true

def birthday(s, d, m):
    if len(s) < m:
        return 0
    
    currentSum = sum(s[:m])
    validSum = 1 if currentSum == d else 0
    
    for i in range(m, len(s)):
        currentSum += s[i]
        currentSum -= s[i - m]
        
        if currentSum == d:
            validSum += 1
    
    return validSum

if __name__ == "__main__":
    s = [2, 2, 1, 3, 2]
    d = 4
    m = 2
    result = birthday(s, d, m)
    print(result)  # Expected output: 2