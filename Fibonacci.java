// Print Fibonacci Series up to Nth term

// Solution 2: Space optimized

// Intuition: For calculating the ith term we only need the last and second last term i.e (i-1)th and (i-2)th term, so we don't need to maintain the whole array.

// Approach:

// Take two variables last and secondLast for storing (i-1)th and (i-2)th term.
// Now iterate from 2 to n and calculate the ith term. ith term is last + secondLast term.
// Then update secondLast term to the last term and the last term to ith term as we iterate.

import java.util.*;

public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        if(n == 0) {
            System.out.print(0);
        }
        else {
            int secondLast = 0;
            int Last = 1;
            System.out.print(secondLast + " " + Last +" ");
            int Current;
            for(int i = 2; i <= n; i++){
                Current = secondLast + Last;
                secondLast = Last;
                Last = Current;
                System.out.print(Current + " ");
            }
        }
    }
}
