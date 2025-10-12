import java.util.*;

public class Capgemini8 {
    public static int CountValidPairs(int[] arr, int k){
        int count = 0;

        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }

        for(int num : arr){
            if(set.contains(num - k)){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print(" " +CountValidPairs(arr, k));
    }
}
