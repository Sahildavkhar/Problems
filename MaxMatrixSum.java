// https://leetcode.com/problems/maximum-matrix-sum/description/?envType=daily-question&envId=2026-01-05

public class MaxMatrixSum {
    public long maxMatrixSum(int[][] matrix) {
        long totalSum = 0;
        int minAbsVal = Integer.MAX_VALUE;
        int negativeCount = 0;

        for(int[] row : matrix){
            for(int val : row){
                totalSum += Math.abs(val);
                if(val < 0){
                    negativeCount++;
                }
                minAbsVal = Math.min(minAbsVal, Math.abs(val));
            }
        }

        if(negativeCount % 2 != 0){
            totalSum = totalSum - 2 * minAbsVal;
        }
        return totalSum;
    }

    public static void main(String[] args) {
        MaxMatrixSum mms = new MaxMatrixSum();
        int[][] matrix = {
            { -1, -2, -3 },
            { 4, 5, -6 },
            { 7, 8, 9 }
        };
        System.out.print(mms.maxMatrixSum(matrix)); // Example usage
    }
}
