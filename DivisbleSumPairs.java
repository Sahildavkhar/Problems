// https://www.hackerrank.com/challenges/divisible-sum-pairs/problem?isFullScreen=true

import java.util.List;

public class DivisbleSumPairs {
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int sum = 0;
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                sum = ar.get(i) + ar.get(j);
                if(sum % k == 0){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> ar = List.of(1, 2, 3, 4, 5, 6);
        int n = ar.size();
        int k = 5;
        int result = divisibleSumPairs(n, k, ar);
        System.out.println("Number of divisible sum pairs: " + result);
    }
}
