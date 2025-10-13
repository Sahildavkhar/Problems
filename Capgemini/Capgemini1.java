package Capgemini;
import java.util.*;

public class Capgemini1 {

    public static boolean isFibonacci(int n){
        int a = 0;
        int b = 1;
        for(int i = 2; i < n; i++){
            int c = a + b;
            a = b;
            b = c;

            if(c == n){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(" "+isFibonacci(num));
    }
}
