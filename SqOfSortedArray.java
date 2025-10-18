public class SqOfSortedArray {
    public static int[] sortedSquares(int[] nums){
        int[] res = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;

        for(int i = nums.length - 1; i >= 0; i--){
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                res[i] = nums[left] * nums[left];
                left++;
            }
            else{
                res[i] = nums[right] * nums[right];
                right--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-7, -3, 2, 3, 11};
        int[] result = sortedSquares(nums);

        System.out.print("Sorted Squares: ");
        for(int num : result){
            System.out.print(num + " ");
        }
    }
}
