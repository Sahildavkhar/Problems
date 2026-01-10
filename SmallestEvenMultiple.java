// https://leetcode.com/problems/smallest-even-multiple/description/

public class SmallestEvenMultiple {
    public static int evenMultiple(int n){
        if(n % 2 == 0){
            return n;
        }
        return n * 2;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.print("The smallest even multiple of " + n + " is: " + evenMultiple(n));
    }
}
