package Sliding_Window;

// There are several cards arranged in a row, and each card has an associated number of points. The points are given in the integer array cardPoints.

// In one step, you can take one card from the beginning or from the end of the row. You have to take exactly k cards.

// Your score is the sum of the points of the cards you have taken.

// Given the integer array cardPoints and the integer k, return the maximum score you can obtain.

// Example 1:

// Input: cardPoints = [1,2,3,4,5,6,1], k = 3
// Output: 12
// Explanation: After the first step, your score will always be 1. However, choosing the rightmost card first will maximize your total score. The optimal strategy is to take the three cards on the right, giving a final score of 1 + 6 + 5 = 12.

class Maxrows {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        if (k < 0 || k > n)
            return -1;
        if (k == 0)
            return 0;
        int sum = 0;
        if (k == n) {
            for (int i = 0; i < n; i++) {
                sum += cardPoints[i];
            }
            return sum;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            sum += cardPoints[i];
        }
        max = Math.max(max, sum);
        for (int i = 0; i < k; i++) {
            sum -= cardPoints[k - i - 1];
            sum += cardPoints[n - 1 - i];
            max = Math.max(max, sum);
        }
        return max;
    }
}

// Alternative: Minimum sum subarray
// Instead of selecting k cards from the two ends, imagine leaving some cards
// unselected in the middle.

// Number of cards left:
// \[
// n-k
// \]

// Therefore:
// \[
// \text{Maximum Score} =
// \text{Total Sum} - \text{Minimum Sum of a Subarray of Length } (n-k)
// \]

// This gives another O(n) solution:
// class Solution {
// public int maxScore(int[] cardPoints, int k) {
// int n = cardPoints.length;
// int window = n - k;

// int total = 0;
// for (int num : cardPoints) {
// total += num;
// }

// if (window == 0) return total;

// int sum = 0;
// for (int i = 0; i < window; i++) {
// sum += cardPoints[i];
// }

// int min = sum;

// for (int i = window; i < n; i++) {
// sum += cardPoints[i] - cardPoints[i - window];
// min = Math.min(min, sum);
// }

// return total - min;
// }
// }
