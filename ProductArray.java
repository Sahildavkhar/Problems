class ProductArray {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            answer[i] = 1;
        }

        int left = 1;
        for(int i = 0; i < nums.length; i++){
            answer[i] = answer[i] * left;
            left = left * nums[i];
        }

        int right = 1;
        for(int i = nums.length - 1; i>=0; i--){
            answer[i] = answer[i] * right;
            right = right * nums[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        ProductArray pa = new ProductArray();
        int[] nums = {1,2,3,4};
        int[] productArray = pa.productExceptSelf(nums);
        System.out.print("Product Array Except Self: ");
        for(int num : productArray){
            System.out.print(num + " ");
        }   
    }
}