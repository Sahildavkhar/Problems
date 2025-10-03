// A Neon number is a number where the sum of digits of the square of the number is equal to the number itself.
// For example, 9 is a Neon number because 9^2 = 81 and 8 + 1 = 9.

public class NeonNum {
    public static void main(String[] args) {
        int num = 9; // Example number
        int square = num * num;
        int sum = 0;

        while(square > 0){
            sum = sum  + square % 10;
            square = square / 10;
        }

        if (sum == num) {
            System.out.println(num + " is a Neon number.");
        } else {
            System.out.println(num + " is not a Neon number.");
        }
    }
}
