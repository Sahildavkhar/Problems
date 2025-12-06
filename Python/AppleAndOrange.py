# AppleAndOrange.java
# Count the number of apples and oranges that fall on a house
# A house is located between points s and t on a number line
# An apple tree is located at point a and an orange tree at point b
# Apples and oranges fall at various distances from their respective trees
# Count how many apples and oranges land on the house

import math
import os
import random
import re
import sys

def countApplesAndOranges(s, t, a, b, apples, oranges):
    countA = 0;
    countO = 0;
    for i in apples:
        if(i + a >= s and i + a <= t):
            countA += 1
    
    for i in oranges:
        if(i + b >= s and i + b <= t):
            countO += 1
    
    print(countA)
    print(countO)
    
if __name__ == '__main__':
    first_multiple_input = input().rstrip().split()

    s = int(first_multiple_input[0])

    t = int(first_multiple_input[1])

    second_multiple_input = input().rstrip().split()

    a = int(second_multiple_input[0])

    b = int(second_multiple_input[1])

    third_multiple_input = input().rstrip().split()

    m = int(third_multiple_input[0])

    n = int(third_multiple_input[1])

    apples = list(map(int, input().rstrip().split()))

    oranges = list(map(int, input().rstrip().split()))

    countApplesAndOranges(s, t, a, b, apples, oranges)