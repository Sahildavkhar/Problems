// FruitsIntoBaskets.java
// LeetCode Problem: 904. Fruits Into Baskets
// Difficulty: Medium

import java.util.*;

class FruitsIntoBaskets{
    public int totalFruit(int[] fruits) {
        int start = 0;
        int end = 0;
        int n = fruits.length;
        int maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        while(end < n){
            map.put(fruits[end], map.getOrDefault(fruits[end], 0) + 1);
            while(map.size() > 2){
                map.put(fruits[start], map.get(fruits[start]) - 1);
                if(map.get(fruits[start]) == 0){
                    map.remove(fruits[start]);
                }
                start++;
            }
            int currLen = end - start + 1;
            maxLen = Math.max(maxLen, currLen);
            end++;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        FruitsIntoBaskets solution = new FruitsIntoBaskets();
        int[] fruits = {1, 2, 1, 2, 3};
        int result = solution.totalFruit(fruits);
        System.out.println("Maximum number of fruits that can be collected: " + result);
    }
}