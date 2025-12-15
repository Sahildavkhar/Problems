// https://leetcode.com/problems/number-of-smooth-descent-periods-of-a-stock/description/?envType=daily-question&envId=2025-12-15

class SmoothDescentPeriods{
    public long getDescentPeriods(int[] prices){
        int n = prices.length;
        long res = 1;
        int prev = 1;

        for(int i = 1; i < n; i++){
            if(prices[i] == prices[i - 1] - 1){
                prev++;
            }
            else{
                prev = 1;
            }
            res = res + prev;
        }
        return res;
    }

    public static void main(String[] args) {
        SmoothDescentPeriods sdp = new SmoothDescentPeriods();
        int[] prices = {3, 2, 1, 4};
        long result = sdp.getDescentPeriods(prices);
        System.out.println("Total smooth descent periods: " + result);
    }
}