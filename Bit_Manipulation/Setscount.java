package Bit_Manipulation;

// Given a positive integer n, write a function that returns the number of set bits in its binary representation (also known as the Hamming weight).

// n = n & (n - 1);
// It removes the rightmost set bit from n.

class Setscount {
    public int hammingWeight(int n) {
        int i = 0;
        while (n > 0) {
            i++;
            n = n & (n - 1);
        }
        return i;
    }
}

// while (n != 0) {
// count += n & 1;
// n = n >>> 1;
// }

// Here:
// - n & 1 checks the rightmost bit.
// - n >>> 1 shifts all bits right by one position, filling the left side with
// zeros.
