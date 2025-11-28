// Java program to calculate the ratios of positive, negative and zero elements in an array
// and print the decimal value of each fraction on a new line with 6 places after the decimal.
// The function plusMinus has the following parameter(s):
// arr: an array of integers
// Print the ratios of positive, negative and zero values in the array. Each value should be printed on a separate line with 6 digits after the decimal point.

import java.util.*;

class PlusMinus{
    public static void plusMinus(List<Integer> arr) {
        double pos = 0;
        double neg = 0;
        double zero = 0;
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) > 0){
                pos = pos + 1;
            }
            if(arr.get(i) < 0){
                neg = neg + 1;
            }
            if(arr.get(i) == 0){
                zero = zero + 1;
            }
        }
        double sumPos = pos / arr.size();
        double sumNeg = neg / arr.size();
        double sumZero = zero / arr.size();
        System.out.println(sumPos);
        System.out.println(sumNeg);
        System.out.println(sumZero);
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(-4, 3, -9, 0, 4, 1);
        plusMinus(arr);
    }
}