// https://leetcode.com/problems/minimum-time-visiting-all-points/description/?envType=daily-question&envId=2026-01-12

class MinTimeVisitingAllPoints {
    public int minTimeToVisitAllPoints(int[][] points) {
        int ans = 0;
        for(int i = 0; i < points.length - 1; i++){
            int currX = points[i][0];
            int currY = points[i][1];
            int targetX = points[i + 1][0];
            int targetY = points[i + 1][1];
            ans += Math.max(Math.abs(targetX - currX), Math.abs(targetY - currY));
        }
        return ans;
    }

    public static void main(String[] args) {
        MinTimeVisitingAllPoints solution = new MinTimeVisitingAllPoints();
        int[][] points = {{1,1},{3,4},{6,1}};
        int result = solution.minTimeToVisitAllPoints(points);
        System.out.println("Minimum time to visit all points: " + result);
    }
}