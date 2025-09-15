// Factorial of a Number

// The factorial of a number N can be calculated by multiplying all natural numbers from 1 to N.
// We can visualize this using recursion:
// factorial(N) = N * factorial(N - 1)
// This means the factorial of N is the product of N and the factorial of N - 1.
// We define a base case:
// If N == 0, we return 1, since 0! = 1 by definition.
// This approach breaks the problem into smaller subproblems, and the results of each subproblem are multiplied together as the recursive calls return.
// The final result is stored and printed as the output of the factorial(N) function.

import java.util.Scanner;

public class Factorial {
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }

        return n * factorial(n - 1);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The Factorial of" + n + " is: " + factorial(n));
    }
}
