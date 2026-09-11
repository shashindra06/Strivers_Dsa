package Binary_Search.easy;

//Input: arr = [4,5,6,7,0,1,2,3]
//Output: 0
//Explanation: The minimum element in the array is 0.

class Min_rotatedbs {
    // Function to find the minimum element using binary search
    public int findMin(int[] nums) {

        // Initialize low and high pointers
        int low = 0, high = nums.length - 1;

        // Binary search loop
        while (low < high) {

            // Calculate mid index
            int mid = low + (high - low) / 2;

            // Check which half to discard
            if (nums[mid] > nums[high]) {

                // Minimum lies in right half
                low = mid + 1;

            } else {

                // Minimum lies in left half (including mid)
                high = mid;
            }
        }

        // Return the minimum element
        return nums[low];
    }
}