// LeetCode Problem 283: Move Zeroes
// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

class MoveZeros {
    public void moveZeroes(int[] nums) {
        int left = 0;
        
        for(int right = 0; right < nums.length; right++){
            if(nums[right] != 0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;
            }
        }
    }

    public static void main(String[] args) {
        MoveZeros mz = new MoveZeros();
        int[] arr = {0, 1, 0, 3, 12};
        mz.moveZeroes(arr);
        System.out.print("Array after moving zeros: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}