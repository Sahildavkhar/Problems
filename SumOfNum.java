// Sum of first N Natural Numbers

// Solution 2: Using the formula

// Intuition: We can use the formula for the sum of N numbers, i.e N(N+1)/2.

// For eg: N=5

// 5(5+1)/2 = 5(6)/2 = 15.

// Approach: 

// Take a variable sum.
// Initialize it with N(N+1)/2, where N is a given number.

public class SumOfNum {
    public static void solve(int n) {
        int sum = n * (n + 1) / 2;
        System.out.println("The Sum of Numbers is:" + sum);
    }

    public static void main(String[] args) {
        int n = 5;
        solve(n);
    }   
    
}
