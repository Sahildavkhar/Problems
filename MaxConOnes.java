// 1004. Max Consecutive Ones III
// Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

public class MaxConOnes {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int maxLength = 0;
        int zeroCount = 0;
        for(int right = 0; right < nums.length; right++){
            if(nums[right] == 0){
                zeroCount++;
            }
            while(zeroCount > k){
                if(nums[left] == 0){
                    zeroCount--;
                }
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        MaxConOnes solution = new MaxConOnes();
        int[] nums = {1, 1, 0, 0, 1, 1, 1, 0};
        int k = 2;
        int result = solution.longestOnes(nums, k);
        System.out.println("Longest subarray of 1s after flipping at most " + k + " zeros: " + result);
    }
}
