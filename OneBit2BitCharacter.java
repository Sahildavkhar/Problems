// OneBit2BitCharacter.java
// 717. 1-bit and 2-bit Characters
// We have two special characters:
// The first character can be represented by one bit 0.
// The second character can be represented by two bits (10 or 11).
// Given a binary array bits that ends with 0, return true if the last character must be a one-bit character.

class OneBit2BitCharacter{
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        while(i < bits.length - 1){
            i = i + bits[i] + 1;
        }
        return i == bits.length - 1;
    }

    public static void main(String[] args) {
        OneBit2BitCharacter solution = new OneBit2BitCharacter();
        int[] bits = {1, 0, 0};
        boolean result = solution.isOneBitCharacter(bits);
        System.out.println("Is the last character a one-bit character? " + result);
    }
}