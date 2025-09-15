import java.util.*;

public class FrequencyHash {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 1, 2};
        int n = arr.length;
        FrequencyHash(arr, n);
    }

    public static void FrequencyHash(int arr[], int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else{
                map.put(arr[i], 1);
            }
        }       
        // Traverse through map and print frequencies
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(" " + entry.getKey() + " " + entry.getValue());
        }
    }
}
