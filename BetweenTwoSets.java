// https://www.hackerrank.com/challenges/between-two-sets/problem

import java.util.List;

public class BetweenTwoSets {
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int n = a.size();
        int m = b.size();
        int count = 0;
        for(int i = 1; i <= 100; i++){
            boolean Ok = true;
            for(int j = 0; j < n && Ok; j++){
                if(i % a.get(j) != 0){
                    Ok = false;
                }
            }
            
            for(int j = 0; j < m && Ok; j++){
               if(b.get(j) % i != 0){
                    Ok = false;
                } 
            }
            
            if(Ok == true){
                count++;
            }
            
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> a = List.of(2, 4);
        List<Integer> b = List.of(16, 32, 96);
        int result = getTotalX(a, b);
        System.out.println(result); // Output: 3
    }
}
