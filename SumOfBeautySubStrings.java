// https://leetcode.com/problems/sum-of-beauty-of-all-substrings/description/

public class SumOfBeautySubStrings {
    public int beautySum(String s) {
        int ans = 0;
        for(int i = 0; i < s.length(); i++){
            int[] freq = new int[26];
            for(int j = i; j < s.length(); j++){
                char ch = s.charAt(j);
                freq[ch-'a']++;
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;
                for(int k = 0; k < 26; k++){
                    if(freq[k] > 0){
                        min = Math.min(min, freq[k]);
                        max = Math.max(max, freq[k]);
                    }
                }
                ans = ans + max - min;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        SumOfBeautySubStrings solution = new SumOfBeautySubStrings();
        String s = "aabcb";
        int result = solution.beautySum(s);
        System.out.println("The sum of beauty of all substrings: " + result);
    }
}
