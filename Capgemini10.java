public class Capgemini10 {
    public static int minCost(int[] arr, int k){
        int n = arr.length;
        int[] dp = new int[n];
        dp[0] = arr[0];

        for(int i = 1; i < n; i++){
            int minCost = Integer.MAX_VALUE;
            for(int j = 1; j <= k; j++){
                if(i - j >= 0){
                    minCost = Math.min(minCost, dp[i - j]);
                }
                dp[i] = arr[i] + minCost;
            }
        }
        return dp[n - 1];
    }
    
    public static void main(String[] args) {
        int[] arr = {10, 30, 40, 20};
        int k = 2;
        System.out.print("" + minCost(arr, k));
    }
}
