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
        for(int i=1; i<=n; i++) {
    for(int j=1; j<=n-i; j++) System.out.print("0");
    for(int j=1; j<=2*i-1; j++) System.out.print("1");
    for(int j=1; j<=n-i; j++) System.out.print("0");
    System.out.println();
}

    }
}
