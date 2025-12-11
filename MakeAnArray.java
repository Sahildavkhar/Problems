// You are given an array A of length N. You take an array B of length N such that B[i] = 0 for each 1 <= i <= N. You can apply the following operation on B any number of times:

// Choose (N - 1) distinct indices and add 1 to each of those indices.

// Task:
// Find the number of operations required to convert array B into array A by applying the given operation. Print -1 if it is impossible to do so.

class MakeAnArray{
    public static int solve(int N, int[] A){
        long sum = 0;
        int maxVal = 0;
        for(int i = 0; i < N; i++){
            sum = sum + A[i];
            maxVal = Math.max(maxVal, A[i]);
        }

        int result = 0;
        if(sum % (N - 1) != 0 || maxVal > sum / (N - 1)){
            return -1;
        }
        else{
            result = (int)(sum / (N - 1));
        }

        return result;
    }

    public static void main(String[] args){
        int N = 4;
        int[] A = {1, 2, 3, 4};
        int result = solve(N, A);
        System.out.println("Result: " + result);
    }
}