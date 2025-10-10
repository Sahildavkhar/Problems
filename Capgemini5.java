public class Capgemini5 {
    public String replaceConsonants(String s){
        String vowels = "aeiou";
        StringBuilder result = new StringBuilder();
        
        for(char ch : s.toCharArray()){
            if(vowels.indexOf(ch) != -1){
                result.append(ch);
            }
            else{
                char nearest = 'a';
                int minDiff = Integer.MAX_VALUE;

                for(char v : vowels.toCharArray()){
                    int diff = Math.abs(ch - v);
                    if(diff < minDiff || (diff == minDiff && v < nearest)){
                        minDiff = diff;
                        nearest = v;
                    }
                }
                result.append(nearest);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Capgemini5 c5 = new Capgemini5();
        String s= "hello";
        System.out.print("" + c5.replaceConsonants(s)); 
    }
}
