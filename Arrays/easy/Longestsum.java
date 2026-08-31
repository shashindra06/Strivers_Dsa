package Arrays.easy;

//Given an array nums of size n and an integer k, find the length of the longest sub-array that sums to k. If no such sub-array exists, return 0.

class Longestsum {
    public int longestSubarray(int[] nums, int k) {
        int n = nums.length;
        int maxlen = 0;
        int sum = nums[0];
        int left = 0, right = 0;

        while (right < n) {

            if (left <= right && sum > k) {
                sum -= nums[left];
                left++;
            }

            if (sum == k) {
                maxlen = Math.max(maxlen, right - left + 1);
            }

            right++;
            if (right < n) {
                sum += nums[right];
            }
        }
        return maxlen;
    }
}