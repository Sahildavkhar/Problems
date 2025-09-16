import java.util.*;

public class MaxMinFreq {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2};
        int n = arr.length;
        FrequencyHash(arr, n);
    }

    public static void FrequencyHash(int arr[], int n) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequencies
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int MaxFreq = 0, MinFreq = n;
        int MaxEle = -1, MinEle = -1;

        // Find min and max frequency elements
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            int ele = entry.getKey();

            if (count > MaxFreq) {
                MaxFreq = count;
                MaxEle = ele;
            }

            if (count < MinFreq) {
                MinFreq = count;
                MinEle = ele;
            }
        }

        System.out.println("The Max Element is: " + MaxEle);
        System.out.println("The Min Element is: " + MinEle);
    }
}
