// Remove Outer Parenthesis
// Given a valid parentheses string s, consider its primitive decomposition: s = p1 + p2 + ... + pk, where pi are primitive valid parentheses strings.
// A primitive valid parentheses string is a non-empty valid parentheses string that cannot be split into two non-empty valid parentheses strings.
// Return s after removing the outermost parentheses of every primitive string in the primitive decomposition of s.

import java.util.*;

class OutermostParenthesis{
    public String removeParenthesis(String s){
        StringBuilder sb = new StringBuilder();
        int left = 0;
        int right = 0;
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                count++;
            }
            if(s.charAt(i) == ')'){
                count--;
                if(count == 0){
                    right = i;
                    sb.append(s.substring(left+1, right));
                    left = ++right;
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide the string with parenthesis");
        String s = sc.next();
        OutermostParenthesis op = new OutermostParenthesis();
        System.out.println(op.removeParenthesis(s));
    }
}