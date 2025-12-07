// Java module to count odd numbers in a given range
// This module provides a method to count the number of odd numbers within a given range [low, high].
// The method countOdds calculates the count of odd numbers between two integers low and high, inclusive.

public class CountOddNum {
    public int countOdds(int low, int high) {
        return (high + 1) / 2 - (low / 2); 
    }

    public static void main(String[] args) {
        CountOddNum counter = new CountOddNum();
        int low = 3;
        int high = 7;
        int result = counter.countOdds(low, high);
        System.out.println("Count of odd numbers between " + low + " and " + high + ": " + result);
    }
}
