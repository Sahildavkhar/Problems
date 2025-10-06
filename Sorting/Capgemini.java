import java.util.*;

public class Capgemini {

    public static int isFibonacci(int n){
        int a = 0;
        int b = 1;
        for(int i = 0; i < n; i++){
            int c = a + b;
            a = b;
            b = c;
        }
        if(b == n){
            return n;
        }
        else{
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] s = {1, 2, 3, 4, 5};
        int sum = 0;
        for(int i = 0; i < s.length; i++){
            sum = sum + s[i];
        }
        if(isFibonacci(sum) == sum){
            System.out.print("True " + sum);
        }
        else{
            System.out.print("False " + isFibonacci(sum));
        }
    }
}
