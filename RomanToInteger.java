// https://leetcode.com/problems/roman-to-integer/

import java.util.HashMap;

public class RomanToInteger {
    public int romanToInt(String s) {
        int res = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for(int i = 0; i < s.length() - 1; i++){
            if(map.get(s.charAt(i)) < map.get(s.charAt(i + 1))){
                res = res - map.get(s.charAt(i));
            }
            else{
                res = res + map.get(s.charAt(i));
            }
        }

        return res + map.get(s.charAt(s.length() - 1));
    }

    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
        String romanNumeral = "MCMXCIV";
        int result = romanToInteger.romanToInt(romanNumeral);
        System.out.println("The integer value of the Roman numeral " + romanNumeral + " is: " + result);
    }
}
