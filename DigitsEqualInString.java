public class DigitsEqualInString {
    public boolean hasSameDigits(String s) {
        char[] a = s.toCharArray();
        for(int i = a.length - 1; i >= 2; i--){
            for(int j = 0; j < i; j++){
                a[j] = (char)((a[j] + a[j + 1]) % 10);
            }
        }
        return a[0] == a[1];
    }

    public static void main(String[] args) {
        DigitsEqualInString solution = new DigitsEqualInString();
        String testString = "3902";
        System.out.print(""+solution.hasSameDigits(testString));

    }
}

