// Reverse a given Array

// Solution 3: Recursive method

// Approach: The recursive method has an approach almost similar to the iterative one. The approach has been broken down into some steps for simplicity.

// Create a function that takes an array, start index, and end index of the array as parameters.
// Swap the elements present  at the start and end index, 
// The portion of the array left to be reversed is arr[start+1,end-1]. Make a recursive call to reverse the rest of the array. While calling recursion pass start +1  and ends - 1 as parameters for the shrunk array. Repeat step 2.
// Continue recursion as long as the ‘start < end’ condition is satisfied. This is the base case for our recursion.

public class Reverse {
    static void printArray(int arr[], int n){
        System.out.print("Reversed Array: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void reverseArray(int arr[], int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverseArray(arr, start++, end--);
        }
    }

    public static void main(String[] args){
        int n = 6;
        int arr[] = {1, 2, 3, 2, 5, 6};
        reverseArray(arr, 0, n-1);
        printArray(arr, n);
    }
}
