// 3370. Smallest Number With All Set Bits

import java.util.*;

public class SmallestNum{
    public static int findSmallest(int n){
        int x = 1;
        while(x < n){
            x = x * 2 + 1;
        }
        return x;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(findSmallest(n)+ "");
    }
}