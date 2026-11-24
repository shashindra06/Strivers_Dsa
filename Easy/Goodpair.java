package Easy;

// Given an array of integers nums, return the number of good pairs.

// A pair (i, j) is called good if nums[i] == nums[j] and i < j.

// Example 1:

// Input: nums = [1,2,3,1,1,3]
// Output: 4
// Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
// Constraints:

// 1 <= nums.length <= 100
// 1 <= nums[i] <= 100

class Goodpair {
    public int numIdenticalPairs(int[] nums) {
        int[] freq = new int[101];
        int c = 0;

        for (int x : nums) {
            c += freq[x]++; // add the old count, then increase it
        }
        return c;
    }
}

// class Solution {
// public int numIdenticalPairs(int[] nums) {
// Map<Integer, Integer> freq = new HashMap<>();
// int c = 0;

// for (int x : nums) {
// int seen = freq.getOrDefault(x, 0); // how many earlier copies of x
// c += seen; // x pairs with each of them
// freq.put(x, seen + 1);
// }
// return c;
// }
// }
