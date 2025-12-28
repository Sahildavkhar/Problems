// https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/description/?envType=daily-question&envId=2025-12-28

public class CountNegativesInMatrix{
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length; j++){
                if(grid[i][j] < 0){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CountNegativesInMatrix counter = new CountNegativesInMatrix();
        int[][] grid = {
            {4, 3, 2, -1},
            {3, 2, 1, -1},
            {1, 1, -1, -2},
            {-1, -1, -2, -3}
        };
        int result = counter.countNegatives(grid);
        System.out.println(result);
    }
}