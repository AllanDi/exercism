package exercisms.BitManipulation;

public class Secrets {
    public static int shiftBack(int value, int amount) {

        return amount == 2 ? value >> amount : value >>> amount;
    }

    public static int setBits(int value, int mask) {
        return value & mask;
    }

    public static int flipBits(int value, int mask) {
        throw new UnsupportedOperationException("Please implement the (static) Secrets.flipBits() method");
    }

    public static int clearBits(int value, int mask) {
        throw new UnsupportedOperationException("Please implement the (static) Secrets.clearBits() method");
    }
}
