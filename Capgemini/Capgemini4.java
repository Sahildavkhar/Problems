package Capgemini;
import java.util.*;

public class Capgemini4{
    public void RemoveDuplicates(String s){
        // StringBuilder result = new StringBuilder();
        HashSet<Character> set = new HashSet<>();
        // for(int i = 0; i < s.length(); i++){
        //     char ch = s.charAt(i);
        //     if(!set.contains(ch)){
        //         set.add(ch);
        //         result.append(ch);
        //     }
        // }

        for(char ch : s.toCharArray()){
            if(!set.contains(ch)){
                set.add(ch);
                System.out.print(ch + ""); 
            }
        }
        // return result.toString();
    }

    public static void main(String[] args){
        Capgemini4 c4 = new Capgemini4();
        String s = "aabbccdde";
        int n = s.length();
        c4.RemoveDuplicates(s);

        // System.out.print("" + c4.RemoveDuplicates(s));
    }

}