package Recursion;

import java.util.ArrayList;
import java.util.List;

class Subsets {

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        List<Integer> current = new ArrayList<>();

        backtrack(nums, 0, current, result);

        return result;
    }

    private void backtrack(int[] nums,
            int index,
            List<Integer> current,
            List<List<Integer>> result) {

        // We have decided for every element
        if (index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Choice 1: Take nums[index]
        current.add(nums[index]);

        backtrack(nums, index + 1, current, result);

        // Undo
        current.remove(current.size() - 1);

        // Choice 2: Don't take nums[index]
        backtrack(nums, index + 1, current, result);
    }
}
