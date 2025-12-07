# Python module to count odd numbers in a given range
# This module provides a method to count the number of odd numbers within a given range [low, high].
# The method count_odds calculates the count of odd numbers between two integers low and high, inclusive.

class CountOddNum:
    def count_odds(self, low: int, high: int) -> int:
        return (high + 1) // 2 - (low // 2)
