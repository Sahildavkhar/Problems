// https://www.hackerrank.com/challenges/sock-merchant/problem?isFullScreen=true

import java.util.HashMap;
import java.util.List;

public class SalesByMatch {
    public static int sockMerchant(int n, List<Integer> ar) {
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : ar){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int value : map.values()){
            result = result + (value / 2);
        }
        return result;
    }

    public static void main(String[] args) {
        SalesByMatch solution = new SalesByMatch();
        List<Integer> ar = List.of(10, 20, 20, 10, 10, 30, 50, 10, 20);
        int n = ar.size();
        int result = solution.sockMerchant(n, ar);
        System.out.println(result);
    }
}
