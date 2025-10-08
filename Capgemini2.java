public class Capgemini2 {
    public String MoveHash(String s){
        int left = s.length() - 1;
        int right = s.length() - 1;
        char[] arr = s.toCharArray();
        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i] != '#'){
                right = i;
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left--;
            }
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        Capgemini2 c2 = new Capgemini2();
        String s = "ab#c#d";
        System.out.print("" + c2.MoveHash(s));
    }
}
