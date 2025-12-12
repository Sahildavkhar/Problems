public class NumberLineJumps {
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        if(x1 < x2 && v1 <= v2){
            return "NO";
        }
        
        if(x2 < x1 && v2 <= v1){
            return "NO";
        }
        
        if((x2 - x1) % (v1 - v2) == 0){
            return "YES";
        }
        return "NO";        
    }

    public static void main(String[] args) {
        int x1 = 0, v1 = 3;
        int x2 = 4, v2 = 2;
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result); // Expected Output: YES
    }
}
