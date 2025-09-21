// Java program to find the missing number

// Approach: Using the formula n(n+1)/2 to find the expected sum of first n natural numbers
// and subtracting the actual sum of the array from it to find the missing number.

public class MissingNumber {
    public static int MissingNumber(int[] arr, int n){
        int expectedSum = n * (n + 1)/2;
        int actualSum = 0;
        for(int i = 0; i < arr.length; i++){
            actualSum += arr[i];
        }
        return expectedSum - actualSum;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5};
        int n = 5;
        System.out.println("Missing Number is :" + MissingNumber(arr, n));
    }
}