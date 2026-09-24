package Strings.easy;

//Input: s = "MCMXCIV"
//Output: 1994
//Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

class Romanint {
    public int romanToInt(String s) {
        int val = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (value(s.charAt(i)) >= value(s.charAt(i + 1))) {
                val += value(s.charAt(i));
            } else {
                val -= value(s.charAt(i));
            }
        }
        val += value(s.charAt(s.length() - 1));
        return val;
    }

    public int value(char s) {
        switch (s) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
