public class Capgemini7 {
    public static int findLongestEvenSubstring(String s){
        int n = s.length();
        int maxLen = 0;

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j += 2){
                int len = j - i + 1;
                int mid = i + len/2;

                int leftSum = 0;
                int rightSum = 0;

                for(int k = i; k < mid; k++){
                    leftSum = leftSum + (s.charAt(k));
                }

                for(int k = mid; k <= j; k++){
                    rightSum = rightSum + (s.charAt(k));
                }

                if(leftSum == rightSum){
                    maxLen = Math.max(maxLen, len);
                }
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "142124";
        System.out.print("" + findLongestEvenSubstring(s));
    }    
}
