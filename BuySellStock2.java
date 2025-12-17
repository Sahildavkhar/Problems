// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-v/description/?envType=daily-question&envId=2025-12-17

public class BuySellStock2 {
    public long maximumProfit(int[] prices, int k) {
        int n = prices.length;
        long[][] dp = new long[k + 1][3];

        for(int j = 1; j <= k; j++){
            dp[j][1] = -prices[0];
            dp[j][2] = prices[0];
        }

        for(int i = 1; i < n; i++){
            for(int j = k; j > 0; j--){
                dp[j][0] = Math.max(dp[j][0], Math.max(dp[j][1] + prices[i], dp[j][2] - prices[i]));
                dp[j][1] = Math.max(dp[j][1], dp[j - 1][0] - prices[i]);
                dp[j][2] = Math.max(dp[j][2], dp[j - 1][0] + prices[i]);
            }
        }
        return dp[k][0];
    }

    public static void main(String[] args) {
        BuySellStock2 solution = new BuySellStock2();
        int[] prices = {3,2,6,5,0,3};
        int k = 2;
        System.out.print(""+solution.maximumProfit(prices, k));
    }
}
