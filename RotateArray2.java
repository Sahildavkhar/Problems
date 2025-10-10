public class RotateArray2 {
    public static void rotate(int[] nums, int k){
        int n = nums.length;
        k = k % n;

        int[] rotate = new int[n];

        for(int i = 0; i < n; i++){
            rotate[(i + k) % n] = nums[i];
        }

        for(int i = 0; i < n; i++){
            nums[i] = rotate[i];
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums, k);
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }    
}
