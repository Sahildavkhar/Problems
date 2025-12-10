// LeetCode Problem: 459. Repeated Substring Pattern
// Difficulty: Easy
// Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.

// Input: s = "abab"
// Output: true
// Explanation: It is the substring "ab" twice.

class RepeatedSubstring{
    public boolean repeatedSubstringPattern(String s) {
        String doubled = s + s;
        String sub = doubled.substring(1, doubled.length() - 1);
        return sub.contains(s);
    }

    public static void main(String[] args) {
        RepeatedSubstring solution = new RepeatedSubstring();
        String s = "abab";
        boolean result = solution.repeatedSubstringPattern(s);
        System.out.println("Does the string \"" + s + "\" have a repeated substring pattern? " + result);
    }
}