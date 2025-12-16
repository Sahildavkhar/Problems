// https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
// Maria plays college basketball and wants to go pro. Each season she maintains a record of her play. She tabulates the number of times she breaks her season record for most points and least points in a game. Points scored in the first game establish her record for the season, and she begins counting from there.

import java.util.*;

class BreakingTheRecords{
    public static List<Integer> breakingRecords(List<Integer> scores) {
        int min = scores.get(0);
        int max = scores.get(0);
        int minCount = 0;
        int maxCount = 0;
        
        for(int i = 1; i < scores.size(); i++){
            if(scores.get(i) < min){
                min = scores.get(i);
                minCount++;
            }
            else if(scores.get(i) > max){
                max = scores.get(i);
                maxCount++;
            }
        }
        List list = Arrays.asList(maxCount, minCount);
        return list;
    }
    public static void main(String[] args) {
        List<Integer> scores = Arrays.asList(10, 5, 20, 20, 4, 5, 2, 25, 1);
        List<Integer> result = breakingRecords(scores);
        System.out.println("Breaking Records Result: " + result);
    }
}