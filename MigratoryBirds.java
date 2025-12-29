// https://www.hackerrank.com/challenges/migratory-birds/problem

import java.util.*;

class MigartoryBirds{
    public static int migratoryBirds(List<Integer> arr) {
        int maxCount = 0;
        int element = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.size(); i++){
            if(!map.containsKey(arr.get(i))){
                map.put(arr.get(i), 1);
            }
            else{
                map.put(arr.get(i), map.get(arr.get(i)) + 1);
            }
            if(map.get(arr.get(i)) > maxCount){
                element = arr.get(i);
                maxCount = map.get(arr.get(i));
            }
            else if(map.get(arr.get(i)) == maxCount && element > arr.get(i)){
                element = arr.get(i);
            }
        }
        return element;      
    }
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 4, 4, 4, 5, 3);
        System.out.println("Most Frequent Bird Type: " + migratoryBirds(arr));
    }
}