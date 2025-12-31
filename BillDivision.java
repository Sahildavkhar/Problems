// https://www.hackerrank.com/challenges/bon-appetit/problem?isFullScreen=true

import java.util.List;

public class BillDivision {
    public static void bonAppetit(List<Integer> bill, int k, int b) {
        int sum = 0;
        for(int i = 0; i < bill.size(); i++){
            if(i == k){
                continue;
            }
            else{
                sum = sum + bill.get(i);
            }
        }
        if( sum / 2 == b){
            System.out.print("Bon Appetit");
        }
        else{
            System.out.print(Math.abs((sum / 2) - b));
        }
    }

    public static void main(String[] args) {
        // Example usage:
        List<Integer> bill = List.of(3, 10, 2, 9);
        int k = 1; // Anna didn't eat item at index 1 (10)
        int b = 12; // Amount Anna contributed
        bonAppetit(bill, k, b); // Should print "5"
    }
}
