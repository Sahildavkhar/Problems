// Count Elements Greater Than Previous Average
// Given an array of positive integers, return the number of elements that are strictly greater than the average of all previous elements. Skip the first element.
// Example
// Input
// responseTimes = [100, 200, 150,300]
// Output
// 2

import java.util.*;

public class EleGreaterThanPrev{
    public static int countResponseTimeRegressions(List<Integer> responseTimes) {
        double sum = 0;
        double avg = 0;
        int count = 0;
        for(int i = 1; i < responseTimes.size(); i++){
            for(int j = 0; j < i; j++){
                if(j == 0){
                    sum = responseTimes.get(j);
                    continue;
                } 
                else{
                    sum = sum + responseTimes.get(j);
                }
            }
            avg = sum / i;
            if(responseTimes.get(i) > avg){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> responseTimes = Arrays.asList(100, 200, 150, 300, 250);
        int result = countResponseTimeRegressions(responseTimes);
        System.out.println("Number of response time regressions: " + result);
    }
}