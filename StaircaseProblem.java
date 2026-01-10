public class StaircaseProblem {
    public int stairs(int n){
        int[] dp = new int [n];
        dp[0] = 1;
        dp[1] = 2;
        dp[2] = 3;

        for(int i = 3; i < n; i++){
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }
        return dp[n - 1];
    }

    public static void main(String[] args) {
        StaircaseProblem solution = new StaircaseProblem();
        int n = 5;
        int result = solution.stairs(n);
        System.out.println("Number of ways to climb " + n + " stairs: " + result);
    }
}
