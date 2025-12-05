// Given an array of integers, count the number of ways to partition the array into two non-empty contiguous subarrays such that the absolute difference between the sums of the two subarrays is even.\
// For example, given the array [10, 10, 3, 7, 6], the valid partitions are:\
// - Partition after the second element: [10, 10] and [3, 7, 6] (sums are 20 and 16, difference is 4, which is even)\
// - Partition after the fourth element: [10, 10, 3, 7] and [6] (sums are 30 and 6, difference is 24, which is even)\
// Thus, the output should be 2.

public class PartitionsWithEvenDiff {
    public int countPartitions(int[] nums) {
        int totalSum = 0;
        for(int num : nums){
            totalSum = totalSum + num;
        }

        int leftSum = 0;
        int count = 0;
        for(int i = 0; i < nums.length - 1; i++){
            leftSum = leftSum + nums[i];
            int rightSum = totalSum - leftSum;
            if((leftSum % 2) == (rightSum % 2)){
                count++;
            }
        }        
        return count;
    }

    public static void main(String[] args) {
        PartitionsWithEvenDiff solver = new PartitionsWithEvenDiff();
        int[] nums = {10, 10, 3, 7, 6};
        int result = solver.countPartitions(nums);
        System.out.println("Number of valid partitions: " + result); // Output: Number of valid partitions: 2
    }
}
