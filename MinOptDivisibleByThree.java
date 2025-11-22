class MinOptDivisbleByThree {
    public int minimumOperations(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 3 == 0){
                continue;
            }
            if((nums[i] - 1) % 3 == 0){
                count++;
            }
            else if((nums[i] + 1) % 3 == 0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        MinOptDivisbleByThree solution = new MinOptDivisbleByThree();
        int[] nums = {1, 2, 3, 4, 5, 6};
        int result = solution.minimumOperations(nums);
        System.out.println("Minimum operations to make all elements divisible by 3: " + result);
    }
}