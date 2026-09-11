package Binary_Search.easy;

//You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

//Return the single element that appears only once.

//Your solution must run in O(log n) time and O(1) space.

//Example 1:

//Input: nums = [1,1,2,3,3,4,4,8,8]
//Output: 2

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length - 1;
        if (n == 0)
            return nums[0];
        if (nums[0] != nums[1])
            return nums[0];
        if (nums[n] != nums[n - 1])
            return nums[n];
        int start = 1, end = nums.length - 2;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            } else if (nums[mid] == nums[mid ^ 1]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return nums[start];
    }
}
