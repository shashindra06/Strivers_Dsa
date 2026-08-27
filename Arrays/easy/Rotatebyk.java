package Arrays.easy;

//Input: nums = [1,2,3,4,5,6,7], k = 3
//Output: [5,6,7,1,2,3,4]

class Rotatebyk {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        if (n == 0 || k == 0)
            return;
        reverse(0, n - 1, nums);
        reverse(0, k - 1, nums);
        reverse(k, n - 1, nums);
    }

    public static void reverse(int i, int j, int[] arr) {
        while (j > i) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
            i++;
        }
    }
}