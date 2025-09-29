// Search a 2D Matrix
// Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:
// Integers in each row are sorted in ascending from left to right.
// The first integer of each row is greater than the last integer of the previous row.
// Time Complexity: O(n + logm)
// Space Complexity: O(1)

import java.util.Scanner;

class BinarySearch{
    public static boolean binarySearch(int[] nums, int target){
        int n = nums.length;
        int low = 0;
        int high = n - 1;

        while(low <= high){
            int mid = (low + high) / 2;
            if(nums[mid] == target){
                return true;
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return false;
    }

    public boolean searchBinary(int[][] nums, int target){
        int n = nums.length;        //no. of rows
        int m = nums[0].length;    //no. of columns

        for(int i = 0; i < n; i++){
            if(nums[i][0] <= target && nums[i][m-1] >= target){
                return binarySearch(nums[i], target);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] nums = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target element: ");
        int target = sc.nextInt();
        BinarySearch obj = new BinarySearch();
        System.out.println(obj.searchBinary(nums, target));
    }
}