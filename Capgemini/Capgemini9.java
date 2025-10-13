package Capgemini;
import java.util.*;

public class Capgemini9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        String S = sc.next();
        String T = sc.next();

        int totalCost = 0;

        for (int i = 0; i < N; i++) {
            char c1 = S.charAt(i);
            int minCost = Integer.MAX_VALUE;

            for (int j = 0; j < M; j++) {
                char c2 = T.charAt(j);
                int diff = Math.abs(c1 - c2);
                int cost = Math.min(diff, 26 - diff);
                minCost = Math.min(minCost, cost);
            }
            totalCost += minCost;
        }

        System.out.println(totalCost);
    }
}
