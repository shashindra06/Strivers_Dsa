package Bit_Manipulation;

// Given an integer n, return true if it is a power of two. Otherwise, return false.
// n     = 1000
// n - 1 = 0111
//         ----
// AND   = 0000

class Poweroftwo {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
