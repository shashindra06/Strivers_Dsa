package Strings.medium;

//Example 1:

//Input: s = "babad"
//Output: "bab"
//Explanation: "aba" is also a valid answer.
//Example 2:

//Input: s = "cbbd"
//Output: "bb"

class Long_Palin {
    public String longestPalindrome(String s) {
        String Longest = "";
        for (int i = 0; i < s.length(); i++) {
            String odd = expand(s, i, i);
            String even = expand(s, i, i + 1);
            if (odd.length() > Longest.length()) {
                Longest = odd;
            }
            if (even.length() > Longest.length()) {
                Longest = even;
            }
        }
        return Longest;
    }

    public String expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}
