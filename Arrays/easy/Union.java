package Arrays.easy;

import java.util.ArrayList;
import java.util.List;

class Union {
    public int[] unionArray(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        List<Integer> arr = new ArrayList<>();

        int i = 0;
        int j = 0;

        while(i < n && j < m) {

            if(nums1[i] < nums2[j]) {

                if(arr.size() == 0 || arr.get(arr.size() - 1) != nums1[i]) {
                    arr.add(nums1[i]);
                }
                i++;

            }
            else if(nums1[i] > nums2[j]) {

                if(arr.size() == 0 || arr.get(arr.size() - 1) != nums2[j]) {
                    arr.add(nums2[j]);
                }
                j++;

            }
            else {

                if(arr.size() == 0 || arr.get(arr.size() - 1) != nums1[i]) {
                    arr.add(nums1[i]);
                }

                i++;
                j++;
            }
        }

        while(i < n) {
            if(arr.size() == 0 || arr.get(arr.size() - 1) != nums1[i]) {
                arr.add(nums1[i]);
            }
            i++;
        }

        while(j < m) {
            if(arr.size() == 0 || arr.get(arr.size() - 1) != nums2[j]) {
                arr.add(nums2[j]);
            }
            j++;
        }

        int[] list = new int[arr.size()];

        for(int k = 0; k < arr.size(); k++) {
            list[k] = arr.get(k);
        }

        return list;
    }
}