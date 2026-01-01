// https://leetcode.com/problems/plus-one/description/?envType=daily-question&envId=2026-01-01

import java.util.*;

class PlusOne{
    public int[] plusOne(int[] digits){
        for(int i = digits.length - 1; i >= 0; i--){
            if(digits[i] != 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        PlusOne solution = new PlusOne();
        int[] digits = {9, 9, 9};
        int[] result = solution.plusOne(digits);
        System.out.println(Arrays.toString(result)); // Output: [1, 0, 0, 0]
    }
}