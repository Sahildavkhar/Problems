import java.util.*;

class RemoveDuplicates {
    // Remove duplicates using HashMap
    public static void removeDuplicates(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        int index = 0;
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, true);
                System.out.print(num + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4};
        removeDuplicates(arr);
        // System.out.print("After removing duplicates: ");
        // for (int i = 0; i < newLen; i++) {
        //     System.out.print(arr[i] + " ");
        // }
    }
}

