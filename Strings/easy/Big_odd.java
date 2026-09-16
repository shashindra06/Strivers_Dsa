package Strings.easy;

//You are given a string num, representing a large integer. Return the largest-valued odd integer (as a string) that is a non-empty substring of num, or an empty string "" if no odd integer exists.

//Input: num = "52"
//Output: "5"

class Big_odd {
    public String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            if ((num.charAt(i) - '0') % 2 != 0)
                return num.substring(0, i + 1);
        }
        return "";
    }
}
