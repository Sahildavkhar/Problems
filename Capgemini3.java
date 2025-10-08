import java.util.HashMap;

public class Capgemini3 {
    public String CharFreq(String s){
        StringBuilder result = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch, 1);
            }
            else{
                map.put(ch, map.get(ch) + 1);
            }
            
            if(i == s.length() - 1 || s.charAt(i + 1) != ch){
                result.append(ch);
                if(map.get(ch) > 1){
                    result.append(map.get(ch));
                }

            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Capgemini3 c3 = new Capgemini3();
        String s = "aaabbbccda";
        System.out.print(c3.CharFreq(s));
    }
    
}
