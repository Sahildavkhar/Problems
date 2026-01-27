// https://leetcode.com/problems/minimum-cost-path-with-edge-reversals/description/?envType=daily-question&envId=2026-01-27

import java.util.*;

class MinCostEdgeRev{
    public int minCost(int n, int[][] edges) {
        List<int[]>[] g = new ArrayList[n];
        for(int i = 0; i < n; i++){
            g[i] = new ArrayList<>();
        }

        for(int[] e : edges){
            int x = e[0];
            int y = e[1];
            int w = e[2];
            g[x].add(new int[] {y, w});
            g[y].add(new int[] {x, 2 * w});
        }

        int[] d = new int[n];
        boolean[] visited = new boolean[n];
        Arrays.fill(d, Integer.MAX_VALUE);
        d[0] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            Comparator.comparingInt(a -> a[0])
        );
        pq.offer(new int[] {0, 0});

        while(!pq.isEmpty()){
            int[] current = pq.poll();
            int dist = current[0];
            int x = current[1];

            if(x == n - 1){
                return dist;
            }

            if(visited[x]){
                continue;
            }
            visited[x] = true;

            for(int[] neighbor : g[x]){
                int y = neighbor[0];
                int w = neighbor[1];

                if(dist + w < d[y]){
                    d[y] = dist + w;
                    pq.offer(new int[] {d[y], y});
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        MinCostEdgeRev solution = new MinCostEdgeRev();
        int n = 5;
        int[][] edges = {
            {0, 1, 10},
            {1, 2, 5},
            {2, 3, 2},
            {3, 4, 1},
            {0, 4, 100}
        };
        int result = solution.minCost(n, edges);
        System.out.println("Minimum cost from node 0 to node " + (n - 1) + " is: " + result);
    }
}