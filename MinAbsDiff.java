// https://leetcode.com/problems/minimum-absolute-difference/description/?envType=daily-question&envId=2026-01-26

import java.util.*;

class MinAbsDiff{
    public List<List<Integer>> minimumAbsDifference(int[] A) {
       Arrays.sort(A);
       int n = A.length;
       int minDiff = Integer.MAX_VALUE;
       List<List<Integer>> res = new ArrayList<>();

       for(int i = 1; i < n; i++){
        int diff = A[i] - A[i - 1];
        if(diff < minDiff){
            minDiff = diff;
            res = new ArrayList<>();
            res.add(Arrays.asList(A[i - 1], A[i]));
        }
        else if(diff == minDiff){
            res.add(Arrays.asList(A[i - 1], A[i]));
        }
       }
       return res;
    }

    public static void main(String[] args){
        MinAbsDiff solution = new MinAbsDiff();
        int[] A = {4, 2, 1, 3};
        List<List<Integer>> result = solution.minimumAbsDifference(A);
        System.out.println("Pairs with minimum absolute difference: " + result);
    }
}