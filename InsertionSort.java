// Insertion Sort Algorithm

// Approach: 

// Select an element in each iteration from the unsorted array(using a loop).
// Place it in its corresponding position in the sorted part and shift the remaining elements accordingly (using an inner loop and swapping).
// The “inner while loop” basically shifts the elements using swapping.
// Time Complexity: O(n^2) as there are two nested loops.
// Auxiliary Space: O(1)

public class InsertionSort {
    public static void InsertionSort(int[] arr, int n){
        for(int i = 0; i <= n - 1; i++){
            int j = i;
            while(j > 0 && arr[j - 1] > arr[j]){
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        System.err.println("After Insertion Sort");
        for(int i = 0; i < n; i++){
            System.err.print(arr[i] + " ");
        }
        System.err.println();
    }
    public static void main(String[] args) {
        int arr[] = {3, 4, 3, 2, 1};
        int n = arr.length;
        System.err.println("Before Insertion Sort");
        for(int i = 0; i < n; i++){
            System.err.print(arr[i] + " ");
        }
        System.err.println();
        InsertionSort(arr, n);
    }
}
