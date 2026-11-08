package Greedy;

import java.util.*;

// You have to divide the intervals into one or more groups such that each interval is in exactly one group, and no two intervals that are in the same group intersect each other.

// Return the minimum number of groups you need to make.
// Input: intervals = [[5,10],[6,8],[1,5],[2,3],[1,10]]
// Output: 3
// Explanation: We can divide the intervals into the following groups:
// - Group 1: [1, 5], [6, 8].
// - Group 2: [2, 3], [5, 10].
// - Group 3: [1, 10].
// The minimum number of groups required equals the maximum number of intervals overlapping at any single point.
// When an interval starts, increase the active count by 1.

// When an interval ends, decrease the active count by 1 — but only after its ending point, because intervals are inclusive.

class IntervalGroups {
    public int minGroups(int[][] intervals) {
        int n = intervals.length;

        int[] start = new int[n];
        int[] end = new int[n];

        for (int i = 0; i < n; i++) {
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int i = 0, j = 0;
        int active = 0, ans = 0;

        while (i < n) {
            if (start[i] <= end[j]) {
                active++;
                ans = Math.max(ans, active);
                i++;
            } else {
                active--;
                j++;
            }
        }

        return ans;
    }
}
