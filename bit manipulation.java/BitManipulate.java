import java.util.*;

public class BitManipulate {
    static int bitMask;
    static int newNumber;

    static void getBit(int n, int pos) {
        bitMask = 1 << pos;
        if ((bitMask & n) == 0)
            System.out.println("The bit is 0");
        else
            System.out.println("The bit is 1");
    }

    static void setBit(int n, int pos) {
        bitMask = 1 << pos;
        newNumber = bitMask | n;
        System.out.println(
                "The new number is " + newNumber + " with binary equivalent : " + Integer.toBinaryString(newNumber));
    }

    static void clearBit(int n, int pos) {
        bitMask = 1 << pos;
        int newBitMask = ~(bitMask);
        newNumber = (newBitMask & n);
        System.out.println("The new Number is " + newNumber);
        System.out.println("The binary equivalent is : " + Integer.toBinaryString(newNumber));
    }

    static void updateBit(int n, int pos) {
        bitMask = 1 << pos;
        if ((bitMask & n) == 0)
            clearBit(n, pos);
        else
            setBit(n, pos);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("The binary equivalent is : " + Integer.toBinaryString(n));
        System.out.println("Enter the position to get the bit");
        int pos = sc.nextInt();
        getBit(n, pos);
        System.out.println("Enter the position to set the bit");
        pos = sc.nextInt();
        setBit(n, pos);
        System.out.println("Enter the position to clear the bit");
        pos = sc.nextInt();
        clearBit(n, pos);
        System.out.println("Enter the position to update the bit");
        pos = sc.nextInt();
        updateBit(n, pos);
        sc.close();
    }
}
