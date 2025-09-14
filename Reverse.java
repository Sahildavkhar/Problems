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
