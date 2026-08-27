package Arrays.easy;

class movezeroes {
    public void moveZeroes(int[] nums) {
        int j = 0;
        int i = 0;
        while (j < nums.length) {
            while (j < nums.length - 1 && nums[j] == 0) {
                j++;
            }
            swap(nums, i, j);
            i++;
            j++;
        }
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
