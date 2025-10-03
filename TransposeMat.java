import java.util.Scanner;

public class TransposeMat {
    public static void transpose(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[][] trans = new int[m][n];

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                trans[j][i] = mat[i][j];
            }
        }

        // print transpose
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mat = new int[n][m];
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        transpose(mat);
        sc.close();
    }
  
}
