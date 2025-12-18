// https://leetcode.com/problems/rearrange-array-elements-by-sign/

class RearrangeArrayElements{
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int neg = 1;
        int pos = 0;
        int[] ans = new int[n];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                ans[pos] = nums[i];
                pos = pos + 2;
            }
            else{
                ans[neg] = nums[i];
                neg = neg + 2;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        RearrangeArrayElements rearranger = new RearrangeArrayElements();
        int[] nums = {3, -2, 1, -5, 4, -6};
        int[] result = rearranger.rearrangeArray(nums);
        
        // Print the rearranged array
        for(int num : result){
            System.out.print(num + " ");
        }
    }
}