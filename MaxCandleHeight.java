// Given a list of candle heights, this program determines how many candles are the tallest.
// For example, given the list [3, 2, 1, 3], the tallest candles are of height 3, and there are 2 such candles.
// The function returns the count of the tallest candles.

import java.util.*;

class MaxCandleHeight{
    public static int birthdayCakeCandles(List<Integer> candles) {
        int maxEle = Integer.MIN_VALUE;
        int count = 0;
        for(int i = 0; i < candles.size(); i++){
            if(maxEle < candles.get(i)){
                maxEle = candles.get(i);
                count = 1;
            }
            else if(maxEle == candles.get(i)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> candles = Arrays.asList(3, 2, 1, 3);
        System.out.println("Number of tallest candles: " + birthdayCakeCandles(candles));
    }
}