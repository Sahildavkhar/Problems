public class ReverseWords {
    public String reverseWords(String s){
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for(int i = words.length - 1; i >= 0; i--){
            result.append(words[i]);
            if(i != 0){
                result.append(" ");
            }
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        ReverseWords rw = new ReverseWords();
        String s = "Hello World from Java";
        System.out.print(rw.reverseWords(s));
    }
}
