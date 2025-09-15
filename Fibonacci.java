import java.util.*;

public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        if(n == 0) {
            System.out.print(0);
        }
        else {
            int secondLast = 0;
            int Last = 1;
            System.out.print(secondLast + " " + Last +" ");
            int Current;
            for(int i = 2; i <= n; i++){
                Current = secondLast + Last;
                secondLast = Last;
                Last = Current;
                System.out.print(Current + " ");
            }
        }
    }
}
