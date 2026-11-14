package Sliding_Window;

// Given a binary array nums and an integer goal, return the number of non-empty subarrays with a sum goal.

// Input: nums = [1,0,1,0,1], goal = 2
// Output: 4
// Explanation: The 4 subarrays are bolded and underlined below:
// [1,0,1,0,1]
// [1,0,1,0,1]
// [1,0,1,0,1]
// [1,0,1,0,1]
// Counting exact-sum windows directly is difficult because zeros can create multiple valid starting positions. Instead, count subarrays with sum at most a limit.
// countAtMost(goal) contains sums up to goal, while countAtMost(goal - 1) contains all smaller sums. Their difference therefore leaves exactly the subarrays whose sum is goal.
// Since every value is non-negative, a sliding window can count each at-most group in linear time.

class Binsubarray {

    // Counts subarrays whose sum is at most the given limit.
    private int countAtMost(int[] nums, int limit) {

        // A binary subarray cannot have a negative sum.
        if (limit < 0) {
            return 0;
        }

        int left = 0;
        int currentSum = 0;
        int count = 0;

        // Expand the window using each index as the right boundary.
        for (int right = 0; right < nums.length; right++) {
            currentSum += nums[right];

            // Shrink until the window sum becomes valid again.
            while (currentSum > limit) {
                currentSum -= nums[left];
                left++;
            }

            // Every start from left to right forms a valid subarray.
            count += right - left + 1;
        }

        return count;
    }

    // Counts subarrays whose sum is exactly equal to goal.
    public int numSubarraysWithSum(int[] nums, int goal) {
        return countAtMost(nums, goal)
                - countAtMost(nums, goal - 1);
    }
}
