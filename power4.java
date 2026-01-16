// https://leetcode.com/problems/power-of-four/description/

class power4{
    public boolean isPowerOfFour(int n) {
        return n > 0 && (n & (n - 1)) == 0 && (n & 0x55555555) != 0;
    }

    public static void main(String[] args) {
        power4 p4 = new power4();
        System.out.println(p4.isPowerOfFour(16)); // true
        System.out.println(p4.isPowerOfFour(5));  // false
    }
}