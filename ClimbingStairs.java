// https://leetcode.com/problems/climbing-stairs/description/

public class ClimbingStairs {
    public int climbStairs(int n) {
        if(n <= 3){
            return n;
        }

        int prev1 = 3;
        int prev2 = 2;
        int cur = 0;

        for(int i = 3; i < n; i++){
            cur = prev1 + prev2;
            prev2 = prev1;
            prev1 = cur;
        }

        return cur;
    }

    public static void main(String[] args) {
        ClimbingStairs cs = new ClimbingStairs();
        int n = 5;
        int result = cs.climbStairs(n);
        System.out.println("Number of ways to climb " + n + " stairs: " + result);
    }
}
