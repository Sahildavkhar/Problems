// Rotate array by K elements

// Approach 2: Using ” Reversal Algorithm “

// Approach:

// For Rotating Elements to right
// Step 1: Reverse the last k elements of the array

// Step 2: Reverse the first n-k elements of the array.

// Step 3: Reverse the whole array.

// For Eg , arr[]={1,2,3,4,5,6,7} , k=2

public class RotateArray {
    public static void Reverse(int[] nums, int start, int end) {
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static int RotateArray(int[] nums, int n, int k){
        k = k % n; // In case k is greater than n
        Reverse(nums, 0, n - k - 1);
        Reverse(nums, n - k, n - 1);
        Reverse(nums, 0, n - 1);
        return 0;
    }
    
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        RotateArray(nums, nums.length, k);
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}

