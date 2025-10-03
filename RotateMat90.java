// Rotate a matrix by 90 degrees in-place

public class RotateMat90 {
    public static void rotate90(int[][] mat) {
    int n = mat.length;

    // transpose in-place
    for(int i=0; i<n; i++) {
        for(int j=i; j<n; j++) {
            int temp = mat[i][j];
            mat[i][j] = mat[j][i];
            mat[j][i] = temp;
        }
    }

    // reverse each row
    for(int i=0; i<n; i++) {
        for(int j=0; j<n/2; j++) {
            int temp = mat[i][j];
            mat[i][j] = mat[i][n-j-1];
            mat[i][n-j-1] = temp;
        }
    }

    // print rotated matrix
    for(int i=0; i<n; i++) {
        for(int j=0; j<n; j++) {
            System.out.print(mat[i][j] + " ");
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        rotate90(mat);
    }
}
