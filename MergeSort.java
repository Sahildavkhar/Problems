// Merge Sort Algorithm

// Approach:

// We will be creating 2 functions mergeSort() and merge().
// mergeSort(arr[], low, high):
// In order to implement merge sort we need to first divide the given array into two halves. Now, if we carefully observe, we need not divide the array and create a separate array, but we will divide the array's range into halves every time. For example, the given range of the array is 0 to 4(0-based indexing). Now on the first go, we will divide the range into half like (0+4)/2 = 2. So, the range of the left half will be 0 to 2 and for the right half, the range will be 3 to 4. Similarly, if the given range is low to high, the range for the two halves will be low to mid and mid+1 to high, where mid = (low+high)/2. This process will continue until the range size becomes.
// So, in mergeSort(), we will divide the array around the middle index(rather than creating a separate array) by making the recursive call :
// 1. mergeSort(arr,low,mid)   [Left half of the array]
// 2. mergeSort(arr,mid+1,high)  [Right half of the array]
// where low = leftmost index of the array, high = rightmost index of the array, and mid = middle index of the array.
// Now, in order to complete the recursive function, we need to write the base case as well. We know from step 2.1, that our recursion ends when the array has only 1 element left. So, the leftmost index, low, and the rightmost index high become the same as they are pointing to a single element.
// Base Case: if(low >= high) return;

import java.util.*;

public class MergeSort {
    private static void merge(int[] arr, int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left <= mid){
            temp.add(arr[left]);
            left++;
        }

        while(right <= high){
            temp.add(arr[right]);
            right++;
        } 

        for(int i = low; i <= high; i++){
            arr[i] = temp.get(i - low);
        }
    }

    public static void mergeSort(int[] arr, int low, int high){
        if(low >= high){
            return;
        }
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 2, 3, 1};
        int n = arr.length;
        System.out.println("Before Merge Sort");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        mergeSort(arr, 0, n - 1);
        System.out.println("After Merge Sort");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
