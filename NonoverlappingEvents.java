// https://leetcode.com/problems/two-best-non-overlapping-events/description/?envType=daily-question&envId=2025-12-23

import java.util.*;

public class NonoverlappingEvents {
    public int maxTwoEvents(int[][] events) {
        PriorityQueue<Pair<Integer, Integer>> pq = new PriorityQueue<>(Comparator.comparingInt(Pair::getKey));
        Arrays.sort(events, (a, b) -> a[0] - b[0]);
        int maxVal = 0;
        int maxSum = 0;

        for(int[] event : events){
            while(!pq.isEmpty() && pq.peek().getKey() < event[0]){
                maxVal = Math.max(maxVal, pq.peek().getValue());
                pq.poll();
            }
            maxSum = Math.max(maxSum, maxVal + event[2]);
            pq.add(new Pair<>(event[1], event[2]));
        }
        return maxSum;
    }

    public static void main(String[] args) {
        NonoverlappingEvents solution = new NonoverlappingEvents();
        int[][] events = {{1,3,2},{4,5,2},{2,4,3}};
        int result = solution.maxTwoEvents(events);
        System.out.println("The maximum sum of two non-overlapping events: " + result);
    }
}
