// Given a binary string s consisting of '0's and '1's, this code calculates the minimum number of adjacent swaps required to group all '0's together in the string.

public class SeperateBalls {
    public long minimumSteps(String s) {
        long count = 0;
        int left = 0;
        for(int right = 0; right < s.length(); right++){
            if(s.charAt(right) == '0'){
                count = count + right - left;
                left++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        SeperateBalls sb = new SeperateBalls();
        String s = "1100101";
        long result = sb.minimumSteps(s);
        System.out.println(result); // Output the result
    }
}
