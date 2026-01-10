// https://leetcode.com/problems/reverse-strings-with-special-characters/description/

import java.util.HashSet;

public class ReverseStrings {
    public String rev(String s, HashSet<Character> sp){
        char[] ch = s.toCharArray();
        int n = s.length();
        int L = 0, R = n - 1;

        while(L < R){
            if(sp.contains(ch[L])){
                L++;
            }
            else if(sp.contains(ch[R])){
                R--;
            }
            else{
                char temp = ch[L];
                ch[L] = ch[R];
                ch[R] = temp;
                L++;
                R--;
            }
        }
        return ch.toString();
    }

    public static void main(String[] args) {
        ReverseStrings solution = new ReverseStrings();
        String s = "ab'-cd";
        HashSet<Character> sp = new HashSet<>();
        sp.add('-');
        System.out.println(" " + solution.rev(s, sp));
    }
}