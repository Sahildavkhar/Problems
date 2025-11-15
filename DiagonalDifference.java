// Java program to calculate the absolute difference
// between the sums of the diagonals of a square matrix.
// For example, given the matrix:
// 11 2 4
// 4 5 6
// 10 8 -12
// The left-to-right diagonal sum is 11 + 5 + (-12) = 4
// The right-to-left diagonal sum is 4 + 5 + 10 = 19

import java.util.*;

public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int n = arr.size();
        int leftToRight = 0;
        int rightToLeft = 0;
        for(int i = 0; i < n; i++){
            leftToRight = leftToRight + arr.get(i).get(i);
            rightToLeft = rightToLeft + arr.get(i).get(n - i - 1);
        }
        int sum = Math.abs(leftToRight - rightToLeft);
        return sum;
    }

    public static void main(String[] args) {
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(Arrays.asList(11, 2, 4));
        matrix.add(Arrays.asList(4, 5, 6));
        matrix.add(Arrays.asList(10, 8, -12));
        
        System.out.println("Diagonal Difference: " + diagonalDifference(matrix));
    }
}
