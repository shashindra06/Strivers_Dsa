package Strings.easy;

//Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
//Input: s = "abcde", goal = "cdeab"
//Output: true

class Rotate {
    public boolean rotateString(String s, String goal) {
        if (s.length() == goal.length()) {
            return (s + s).contains(goal);
        }
        return false;
    }
}
