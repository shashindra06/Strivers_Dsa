package StacksQueues;

// Given a circular integer array nums (i.e., the next element of nums[nums.length - 1] is nums[0]), return the next greater number for every element in nums.

// The next greater number of a number x is the first greater number to its traversing-order next in the array, which means you could search circularly to find its next greater number. If it doesn't exist, return -1 for this number.

// Example 1:

// Input: nums = [1,2,1]
// Output: [2,-1,2]
// Explanation: The first 1's next greater number is 2; 
// The number 2 can't find next greater number. 
// The second 1's next greater number needs to search circularly, which is also 2.

// we can hypothetically double the array using the modulus operator. Traverse from 2 * N - 1 to 0 and access elements using index % N.
// In the first pass, only prepare the stack. In the second pass, use the stack top as the Next Greater Element if available; otherwise, store -1. After processing each element, push it into the stack for future comparisons.

import java.util.*;

class Solution {
    // Finds next greater values with a monotonic stack.
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        Arrays.fill(answer, -1);
        Deque<Integer> candidates = new ArrayDeque<>();

        // Two reverse passes simulate circular order.
        for (int i = 2 * n - 1; i >= 0; i--) {
            int index = i % n;

            // Blocked values cannot be strictly greater.
            while (!candidates.isEmpty() &&
                    candidates.peek() <= nums[index]) {
                candidates.pop();
            }

            // Only the real pass writes final answers.
            if (i < n && !candidates.isEmpty()) {
                answer[index] = candidates.peek();
            }

            candidates.push(nums[index]);
        }

        return answer;
    }
}

// Driver code
public class Next_greater2 {
    public static void main(String[] args) {
        int[] nums = { 2, 1, 2, 4, 3 };
        Solution obj = new Solution();
        System.out.println(
                Arrays.toString(obj.nextGreaterElements(nums)));
    }
}