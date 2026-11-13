package Sliding_Window;

import java.util.HashMap;
import java.util.Map;
// You are visiting a farm that has a single row of fruit trees arranged from left to right. The trees are represented by an integer array fruits where fruits[i] is the type of fruit the ith tree produces.

// You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow:

// You only have two baskets, and each basket can only hold a single type of fruit. There is no limit on the amount of fruit each basket can hold.
// Starting from any tree of your choice, you must pick exactly one fruit from every tree (including the start tree) while moving to the right. The picked fruits must fit in one of your baskets.
// Once you reach a tree with fruit that cannot fit in your baskets, you must stop.
// Given the integer array fruits, return the maximum number of fruits you can pick.
// Input: fruits = [1,2,3,2,2]
// Output: 4
// Explanation: We can pick from trees [2,3,2,2].
// If we had started at the first tree, we would only pick from trees [1,2].

class UniqTrees {

    // Longest subarray containing at most two distinct fruit types.
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> frequency = new HashMap<>();

        int left = 0;
        int maxFruits = 0;

        for (int right = 0; right < fruits.length; right++) {
            // Expand the window by adding the current fruit.
            frequency.put(
                    fruits[right],
                    frequency.getOrDefault(fruits[right], 0) + 1);

            // Shrink from the left until at most two types remain.
            while (frequency.size() > 2) {
                int fruit = fruits[left];
                frequency.put(fruit, frequency.get(fruit) - 1);

                if (frequency.get(fruit) == 0) {
                    frequency.remove(fruit);
                }

                left++;
            }

            // The window is always valid here, so update the answer.
            maxFruits = Math.max(maxFruits, right - left + 1);
        }

        return maxFruits;
    }
}
