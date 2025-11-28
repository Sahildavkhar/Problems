// Submissions Leaderboard Discussions Editorial
// Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

import java.util.List;

public class MaxMin {
    public static void miniMaxSum(List<Integer> arr) {
        long x = 0;
        long y = 0;
        for(int i = 0; i < arr.size() - 1; i++){
            x = x + arr.get(i);
        }
        for(int i = 1; i < arr.size(); i++){
            y = y + arr.get(i);
        }
        System.out.print(x + " " + y);
    }

    public static void main(String[] args) {
        List<Integer> arr = List.of(1, 2, 3, 4, 5);
        miniMaxSum(arr);
    }
}
