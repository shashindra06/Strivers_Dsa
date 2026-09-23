package Recursion;

import java.util.ArrayList;
import java.util.List;

//Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

//Example 1:

//Input: n = 3
//Output: ["((()))","(()())","(())()","()(())","()()()"]

class Parenthesis {

    public List<String> generateParenthesis(int n) {

        List<String> ans = new ArrayList<>();

        StringBuilder sb = new StringBuilder();

        backtrack(sb, 0, 0, n, ans);

        return ans;
    }

    private void backtrack(StringBuilder sb,
            int open,
            int close,
            int n,
            List<String> ans) {

        // We have used all brackets
        if (open == n && close == n) {
            ans.add(sb.toString());
            return;
        }

        // Add '('
        if (open < n) {
            sb.append('(');

            backtrack(sb, open + 1, close, n, ans);

            // Undo
            sb.deleteCharAt(sb.length() - 1);
        }

        // Add ')'
        if (close < open) {
            sb.append(')');

            backtrack(sb, open, close + 1, n, ans);

            // Undo
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
