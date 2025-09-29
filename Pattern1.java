// Pattern Printing
// 0000000001000000000
// 0000000011100000000
// 0000000111110000000
// 0000001111111000000
// 0000011111111100000
// 0000111111111110000
// 0001111111111111000
// 0011111111111111100
// 0111111111111111110
// 1111111111111111111

public class Pattern1 {
    public static void main(String[] args){
        int n = 10;
        int size = 2*n - 1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < size; j++){
                if(j >= n - 1 - i && j <= n - 1 + i){
                    System.out.print("1");
                }
                else{
                    System.err.print("0");
                }
            }
            System.out.println();
        }
    }
}
