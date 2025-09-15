// Check if the given String is Palindrome or not

// Recursive Approach:

// In this approach, we check the string using functional recursion where firstly, the letters on the two ends of the string (start, end) are compared to see if they’re the same or not.
// If they’re the same then we simply call recursion for the next elements (start+1, end-1) and so on until the start becomes greater than or equal to the end. 
// If at any point the start and the end differ, we return false stating that the string is not a palindrome.
// Otherwise, if the base condition is reached, then the string is obviously a palindrome and we return true.

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
