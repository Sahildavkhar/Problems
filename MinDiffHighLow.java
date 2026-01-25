// https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/description/?envType=daily-question&envId=2026-01-25

import java.util.*;

class MinDiffHighLow{
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = nums[k - 1] - nums[0];
        for(int i = 0; i + k <= nums.length; i++){
            ans = Math.min(ans, nums[i + k - 1] - nums[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        MinDiffHighLow solution = new MinDiffHighLow();
        int[] nums = {9,4,1,7};
        int k = 2;
        System.out.println(solution.minimumDifference(nums, k));
    }
}