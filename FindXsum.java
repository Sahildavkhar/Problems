// Find X-sum of All K-long Subarrays | LeetCode Solution
// https://leetcode.com/problems/find-x-sum-of-all-k-long-subarrays/description/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FindXsum {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];

        for (int i = 0; i <= n - k; i++) {
            Map<Integer, Integer> freq = new HashMap<>();

            // Count frequency in current subarray
            for (int j = i; j < i + k; j++) {
                freq.put(nums[j], freq.getOrDefault(nums[j], 0) + 1);
            }

            // Sort elements by (frequency desc, value desc)
            List<int[]> list = new ArrayList<>();
            for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
                list.add(new int[]{e.getKey(), e.getValue()});
            }

            list.sort((a, b) -> {
                if (b[1] == a[1]) return b[0] - a[0]; // same freq → higher value first
                return b[1] - a[1]; // higher freq first
            });

            // Pick top x elements
            Set<Integer> topX = new HashSet<>();
            for (int j = 0; j < Math.min(x, list.size()); j++) {
                topX.add(list.get(j)[0]);
            }

            // Calculate sum of elements that are in top X
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                if (topX.contains(nums[j])) sum += nums[j];
            }

            ans[i] = sum;
        }
        return ans;         
    }

    public static void main(String[] args) {
        FindXsum finder = new FindXsum();
        int[] nums = {1,1,2,2,3,4,2,3};
        int k = 6;
        int x = 2;
        int[] result = finder.findXSum(nums, k, x);
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
