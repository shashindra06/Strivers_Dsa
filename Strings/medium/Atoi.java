package Strings.medium;

//Whitespace,Signedness,Conversion,Rounding
//Input: s = " -042"

//Output: -42

class Atoi {
    public int myAtoi(String s) {
        int n = s.length();
        long ans = 0;
        int i = 0;
        int sign = 1;
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }
        if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            if (s.charAt(i) == '-') {
                sign = -1;
            }
            i++;
        }
        while (i < n && Character.isDigit(s.charAt(i)) && ans < Integer.MAX_VALUE && ans > Integer.MIN_VALUE) {
            int a = s.charAt(i) - '0';
            ans = ans * 10 + a;
            i++;
        }
        ans *= sign;
        if (ans > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (ans < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int) ans;
    }
}
