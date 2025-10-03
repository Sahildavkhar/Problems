// ArmstrongNum.java
// Check if a number is an Armstrong number or not.

public class ArmstrongNum {
    public static void main(String[] args) {
        int num = 153; // Example number
        int temp = num;
        int sum = 0;

        while(temp > 0){
            int digit = temp % 10;
            sum = sum + (digit * digit * digit);
            temp = temp / 10;
        }

        if (sum == temp) {
            System.out.println(temp + " is an Armstrong number.");
        } else {
            System.out.println(temp + " is not an Armstrong number.");
        }
    }
}
