class SortArrayByParity{
    public int[] sortArray(int[] nums){
        int left = 0;
        for(int right = 0; right < nums.length; right++){
            if(nums[right] % 2 == 0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        SortArrayByParity sap = new SortArrayByParity();
        int[] nums = {3,1,2,4};
        int[] sortedArray = sap.sortArray(nums);
        System.out.print("Sorted Array by Parity: ");
        for(int num : sortedArray){
            System.out.print(num + " ");
        }
    }
}