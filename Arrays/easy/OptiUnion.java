package Arrays.easy;

import java.util.ArrayList;
import java.util.List;

class OptiUnion {
    public int[] unionArray(int[] nums1, int[] nums2) {

        List<Integer> arr = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {

            int value;

            if (nums1[i] < nums2[j]) {
                value = nums1[i++];
            } else if (nums1[i] > nums2[j]) {
                value = nums2[j++];
            } else {
                value = nums1[i];
                i++;
                j++;
            }

            if (arr.isEmpty() || arr.get(arr.size() - 1) != value) {
                arr.add(value);
            }
        }

        while (i < nums1.length) {
            if (arr.isEmpty() || arr.get(arr.size() - 1) != nums1[i]) {
                arr.add(nums1[i]);
            }
            i++;
        }

        while (j < nums2.length) {
            if (arr.isEmpty() || arr.get(arr.size() - 1) != nums2[j]) {
                arr.add(nums2[j]);
            }
            j++;
        }

        int[] result = new int[arr.size()];

        for (int k = 0; k < arr.size(); k++) {
            result[k] = arr.get(k);
        }

        return result;
    }
}
