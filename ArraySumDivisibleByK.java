// Minimum Operations to Make Array Sum Divisible by K
// Given an array of integers nums and an integer k, return the minimum number of operations needed to make the sum of the array divisible by k.
// An operation consists of choosing an index i and replacing nums[i] with nums[i] + 1.

public class ArraySumDivisibleByK {
    public static int minOperations(int[] nums, int k){
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
        }
        return sum % k;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 7, 11};
        int k = 5;
        int result = minOperations(nums, k);
        System.out.println("The minimum operations needed: " + result);
    }
}
