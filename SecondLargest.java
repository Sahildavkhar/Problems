// Find Second Largest Element in an array

// Solution 3(Best Solution)
// Intuition:
// In the previous solution, even though we were able to bring down the time complexity to O(N), we still needed to do two traversals to find our answer. Can we do this in a single traversal by using smart comparisons on the go?

// Approach:
// We would require four variables: small,second_small, large, and second_large. Variable small and second_small are initialized to INT_MAX while large and second_large are initialized to INT_MIN.

// Second Largest Algo:

// If the current element is larger than ‘large’ then update second_large and large variables
// Else if the current element is larger than ‘second_large’ then we update the variable second_large.
// Once we traverse the entire array, we would find the second largest element in the variable second_large.

// Here’s a quick demonstration of the same.

public class SecondLargest {
    public static int findSecondLargest(int[] arr, int n){
        if(n < 2){
            return -1;
        }
        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(arr[i] > large){
                secondLarge = large;
                large = arr[i];
            }
            else if(arr[i] > secondLarge && arr[i] != large){
                secondLarge = arr[i];
            }
        }
        return secondLarge;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 6, 5};
        int n = arr.length;
        System.out.print("Second Largest Element is: " + findSecondLargest(arr, n));
    }
    
}
