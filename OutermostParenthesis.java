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