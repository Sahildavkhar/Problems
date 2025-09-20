// Longest Subarray with given Sum K(Positives)

public class LongestSubArray {
    public static int longestSubArray(int[] arr, int n, int k){
        int maxLength = 0;
        int currentLength = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] <= k){
                currentLength++;
            }
            else{
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 0;
            }
        }
        maxLength = Math.max(maxLength, currentLength);
        return maxLength;        
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 10;
        int n = arr.length;
        System.out.print("Longest Subarray Length is: " + longestSubArray(arr, n, k));
    }
    
}