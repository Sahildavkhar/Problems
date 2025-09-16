// Find the highest/lowest frequency element

// Optimized approach(Using map):

// We can use a map of value and frequency pair, in which we can easily update the frequency of an element if it is already present in the map, if it is not present in the map then insert it in the map with frequency as 1. After completing all the iterations, we will find the element with the highest frequency and the element with the lowest frequency.

// The steps are as follows:

// Take a unordered_map<int, int> / HashMap of <Integer, Integer> pair.
// Use a for loop to iterate the array.
// If the element is not present in the map then insert it with frequency 1, otherwise increase the existing frequency by 1.
// After visiting the whole array, we will find the element with the highest frequency and the element with the lowest frequency by iterating the map.

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
