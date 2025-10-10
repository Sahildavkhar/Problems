public class GCD {
    public static int GCDofTwo(int a , int b){
        while(a > 0 && b > 0){
            if(a > b){
                a = a % b;
            }
            else{
                b = b % a;
            }

            if(a == 0){
                return b;
            }
            else{
                return a;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int a = 15;
        int b = 12;
        System.out.print("" + GCDofTwo(a, b));
    }
    
}
