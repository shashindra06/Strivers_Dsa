package Binary_Search.easy;

//A peak element is an element that is strictly greater than its neighbors.
//Input: nums = [1,2,1,3,5,6,4]
//Output: 5
//Explanation: Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.

class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0, end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}