package Greedy;

//Given an array of intervals intervals where intervals[i] = [starti, endi], return the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.
// Choosing the interval that finishes earliest leaves as much room as possible for the intervals that follow.

// This is the classic interval scheduling strategy: maximize the number of non-overlapping intervals.

// Since the question asks for the minimum number to remove, we can calculate:

// Minimum removals = Total intervals − Maximum non-overlapping intervals.

import java.util.Arrays;

class Nonoverlap {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int count = 1;
        int high = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= high) {
                count++;
                high = intervals[i][1];
            }
        }

        return intervals.length - count;
    }
}