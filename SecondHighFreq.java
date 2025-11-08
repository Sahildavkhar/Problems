// Find and print all elements in an array that have the second highest frequency.

import java.util.HashMap;

public class SecondHighFreq {
    public static void reqArr(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxFreq = 0;
        int SecondFreq = 0;
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }
            else{
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }

        for(int freq : map.values()){
            if(freq > maxFreq){
                maxFreq = freq;
            }
        }

        for(int freq : map.values()){
            if(freq > SecondFreq && freq != maxFreq){
                SecondFreq = freq;
            }
        }

        for(int key : map.keySet()){
            if(map.get(key) == SecondFreq){
                System.out.print("" + key + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        reqArr(nums);
    }
}
