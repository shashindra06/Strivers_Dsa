package Strings.easy;

//Input: s = "(()())(())"
//Output: "()()()"
//Explanation: 
//The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
//After removing outer parentheses of each part, this is "()()" + "()" = "()()()".

class Paran {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int ct = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (ct > 0) {
                    ans.append(c);
                }
                ct++;
            } else {
                ct--;
                if (ct > 0) {
                    ans.append(c);
                }
            }
        }
        return ans.toString();
    }
}
