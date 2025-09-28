// Check if a number is a power of 2
// Time Complexity: O(1)
// Space Complexity: O(1)

import java.util.*;

class power2{
    public static boolean power2(int n){
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(power2(n));
    }
}