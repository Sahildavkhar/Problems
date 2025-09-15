public class Palindrome {
    public static boolean Palindrome (int i, String s) {
        if (i >= s.length() / 2) {
            return true;  
        }
        if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
            return false; 
        }
        return Palindrome(i + 1, s); 
    }

    public static void main(String[] args) {
        String s = "madam";
        System.out.println(Palindrome(0, s)); 
    }
}
