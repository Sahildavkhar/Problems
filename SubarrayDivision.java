// https://www.hackerrank.com/challenges/the-birthday-bar/problem?isFullScreen=true

public class SubarrayDivision {
    public static int birthday(int[] s, int d, int m){
        if(s.length < m) return 0;

        int currentSum = 0;
        for(int i = 0; i < m; i++){
            currentSum = currentSum + s[i];
        }
        int validSum = (currentSum == d) ? 1 : 0;
        for(int i = m; i < s.length; i++){
            currentSum = currentSum + s[i] - s[i - m];
            if(currentSum == d){
                validSum++;
            }
        }
        return validSum;
    }

    public static void main(String[] args) {
        int[] s = {2, 2, 1, 3, 2};
        int d = 4;
        int m = 2;
        System.out.println(birthday(s, d, m)); // Output: 2
    }
}
