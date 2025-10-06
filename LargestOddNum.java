// Given a string s representing a large integer, return the largest-valued odd integer (as a string) that is a non-empty substring of s, or an empty string "" if no odd integer exists.
// A substring is a contiguous sequence of characters within a string.
// Example 1:
// Input: s = "52"

import java.util.*;

public class LargestOddNum {
    public String LargestOddNum(String s){
        for(int i = s.length() - 1; i >= 0; i--){
            if(Character.getNumericValue(s.charAt(i)) % 2 == 1){
                return s.substring(0, i + 1);
            } 
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        LargestOddNum lon = new LargestOddNum();
        System.err.println(" "+lon.LargestOddNum(s));
    }
}
