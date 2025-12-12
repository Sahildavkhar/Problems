def kangaroo(x1, v1, x2, v2):
    if x1 < x2 and v1 <= v2:
        return "NO"
        
    if x2 < x1 and v2 <= v1:
        return "NO"
        
    if (x2 - x1) % (v1 - v2) == 0:
        return "YES"
        
    return "NO"

x1, v1, x2, v2 = map(int, input().split())
result = kangaroo(x1, v1, x2, v2)