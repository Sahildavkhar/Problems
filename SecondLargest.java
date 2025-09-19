
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
