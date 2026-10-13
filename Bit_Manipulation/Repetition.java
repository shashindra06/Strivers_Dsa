package Bit_Manipulation;

// Given an integer array nums where every element appears three times except for one, which appears exactly once. Find the single element and return it.
// You must implement a solution with a linear runtime complexity and use only constant extra space.

// Input: nums = [2,2,3,2]
// Output: 3

// Number	Binary
// 2	010
// 2	010
// 3	011
// 2	010
// Now count the number of 1s at each bit position.
// Bit position	    Count of 1s	  Remainder after dividing by 3
// 0 (rightmost)	  1	             1
// 1	              4	             1
// 2	              0	             0

// Every number that appears three times contributes its bits three times. Those contributions disappear when we take the count modulo 3.

class Repetition {
    public int singleNumber(int[] nums) {
        int ans = 0;

        for (int bit = 0; bit < 32; bit++) {
            int count = 0;

            for (int num : nums) {
                if (((num >> bit) & 1) == 1) {
                    count++;
                }
            }

            if (count % 3 != 0) {
                ans |= (1 << bit);
            }
        }

        return ans;
    }
}
