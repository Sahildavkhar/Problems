// Given a string s, partition s such that every substring of the partition is a palindrome. Return all possible palindrome partitioning of s.

import java.util.*;

class PalindromePartitioning{
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(String s, int start, List<String> path, List<List<String>> result){
        if(start == s.length()){
            result.add(new ArrayList<>(path));
            return;
        }

        for(int end = start + 1; end <= s.length(); end++){
            if(isPalindrome(s, start, end - 1)){
                path.add(s.substring(start, end));
                backtrack(s, end, path, result);
                path.remove(path.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s, int left, int right){
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromePartitioning pp = new PalindromePartitioning();
        String s = "aab";
        List<List<String>> partitions = pp.partition(s);
        System.out.println("Palindrome Partitions of \"" + s + "\": " + partitions);
    }
}