// https://leetcode.com/problems/maximize-happiness-of-selected-children/description/?envType=daily-question&envId=2025-12-25

import java.util.Comparator;
import java.util.PriorityQueue;

public class MaximizeHappiness {
    public long maximumHappinessSum(int[] happiness, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int h : happiness){
            pq.add(h);
        }

        long totalHappinessSum = 0;
        int turns = 0;

        for(int i = 0; i < k; i++){
            totalHappinessSum = totalHappinessSum + Math.max(pq.poll() - turns, 0);
            turns++;
        }

        return totalHappinessSum;
    }

    public static void main(String[] args) {
        MaximizeHappiness solution = new MaximizeHappiness();
        int[] happiness = {5, 3, 8, 6};
        int k = 5;
        long result = solution.maximumHappinessSum(happiness, k);
        System.out.println("Maximum Happiness Sum: " + result);
    }
}
