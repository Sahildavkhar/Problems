package Capgemini;
public class Capgemini6 {
    public static void printWords(String s){
        StringBuilder word = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == ' '){
                printSwapped(word.toString());
                word.setLength(0);
            }
            else{
                word.append(ch);
            }
        }

        if(word.length() > 0){
            printSwapped(word.toString());
        }
    }

    public static void printSwapped(String word){
        StringBuilder swapped = new StringBuilder();

        for(char ch : word.toCharArray()){
            if(Character.isLowerCase(ch)){
                swapped.append(Character.toUpperCase(ch));
            }
            else{
                swapped.append(Character.toLowerCase(ch));
            }
        }
        System.out.println(swapped.toString());
    }

    public static void main(String[] args) {
        String s = "Hello World";
        printWords(s);
    }    
}
